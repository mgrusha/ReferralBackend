package com.referralfinder.ReferralServer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.referralfinder.ReferralServer.models.ReferralModel;
import com.referralfinder.ReferralServer.repository.ReferralRepository;

@Service
public class ReferralService {

	@Autowired
	private ReferralRepository referralRepository;

	public List<ReferralModel> list() {
		return referralRepository.findAll();
	}
}
