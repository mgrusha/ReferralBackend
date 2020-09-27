package com.referralfinder.ReferralServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.referralfinder.ReferralServer.Requests.ReferralRequest;
import com.referralfinder.ReferralServer.models.Referral;
import com.referralfinder.ReferralServer.repository.ReferralRepository;

@Service
public class ReferralService {

	@Autowired
	private ReferralRepository referralRepository;

	public List<Referral> list() {
		return referralRepository.findAll();
	}

	public Referral add(ReferralRequest referral){
		Referral Referral = new Referral()
				.withCode(referral.getCode())
				.withUrl(referral.getLink());

		return referralRepository.save(Referral);
	}

	public List<Referral> getById(List<Long> id){
		return referralRepository.findAllById(id);
	}
}
