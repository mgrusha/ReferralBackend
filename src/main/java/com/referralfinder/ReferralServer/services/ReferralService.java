package com.referralfinder.ReferralServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.referralfinder.ReferralServer.Entities.Referral;
import com.referralfinder.ReferralServer.Requests.ReferralRequest;
import com.referralfinder.ReferralServer.models.ReferralModel;
import com.referralfinder.ReferralServer.repository.ReferralRepository;

@Service
public class ReferralService {

	@Autowired
	private ReferralRepository referralRepository;

	public List<ReferralModel> list() {
		return referralRepository.findAll();
	}

	public ReferralModel add(ReferralRequest referral){
		ReferralModel referralModel = new ReferralModel(referral.getLink(),referral.getCode());

		return referralRepository.save(referralModel);
	}

	public List<ReferralModel> getById(List<Long> id){
		return referralRepository.findAllById(id);
	}
}
