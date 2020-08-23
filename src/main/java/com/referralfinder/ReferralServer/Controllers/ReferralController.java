package com.referralfinder.ReferralServer.Controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.referralfinder.ReferralServer.Requests.ReferralRequest;
import com.referralfinder.ReferralServer.models.Referral;
import com.referralfinder.ReferralServer.responses.AddReferralResponse;
import com.referralfinder.ReferralServer.services.ReferralService;

@RestController
@RequestMapping("/referral")
public class ReferralController {

	private static final int CODE_SUCCESS = 100;
	private static final int AUTH_FAILURE = 102;
	private static final String SUCCESS_STATUS = "success";
	private static final String ERROR_STATUS = "error";
	private final String sharedKey = "SHARED_KEY";

	@Autowired
	private ReferralService referralService;

	@GetMapping("/all")
	public List<Referral> getAll() {
		//		referrals.add(new Referral(1,"http://goo.gl/XXX55511","XXX55511"));
		//		referrals.add(new Referral(2,"http://uber.com/SSSSSS2323","SSSSSS2323"));
		//		referrals.add(new Referral(3,"http://booking.com/12343","YYBB3344"));

		return referralService.list();
	}

	@GetMapping()
	@ResponseBody
	public List<Referral> addFoo(@RequestParam Long id) {
		return referralService.getById(Arrays.asList(id));
	}

	@PostMapping("/add")
	public AddReferralResponse add(@RequestParam(value = "key") String key, @RequestBody ReferralRequest request) {

		final AddReferralResponse response;

		if (sharedKey.equalsIgnoreCase(key)) {
			Long id = referralService.add(request).getId();
			response = new AddReferralResponse(SUCCESS_STATUS, CODE_SUCCESS, id);
		} else {
			response = new AddReferralResponse(ERROR_STATUS, AUTH_FAILURE, -1L);
		}
		return response;
	}
}
