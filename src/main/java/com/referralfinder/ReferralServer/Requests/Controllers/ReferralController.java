package com.referralfinder.ReferralServer.Requests.Controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.referralfinder.ReferralServer.Entities.Referral;
import com.referralfinder.ReferralServer.models.ReferralModel;
import com.referralfinder.ReferralServer.services.ReferralService;

@RestController
@RequestMapping("/referral")
public class ReferralController {

	@Autowired
	private ReferralService referralService;

	@GetMapping("/all")
	public String getAll() {
		List<ReferralModel> referrals = referralService.list();
//		referrals.add(new Referral(1,"http://goo.gl/XXX55511","XXX55511"));
//		referrals.add(new Referral(2,"http://uber.com/SSSSSS2323","SSSSSS2323"));
//		referrals.add(new Referral(3,"http://booking.com/12343","YYBB3344"));
		Gson gson = new Gson();
		String json = gson.toJson(referrals);
		return json;
	}

	@GetMapping()
	@ResponseBody
	public String addFoo( @RequestParam Integer id) {
		return new Gson().toJson(new Referral(id,"http://goo.gl/XXX555"+id,"XXX555"+id));
	}
}
