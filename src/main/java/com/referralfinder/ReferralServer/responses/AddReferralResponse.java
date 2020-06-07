package com.referralfinder.ReferralServer.responses;

import com.referralfinder.ReferralServer.Entities.Referral;

public class AddReferralResponse extends BaseResponse {

	private Long referralId;

	public AddReferralResponse(String status, Integer code, Long referralId) {
		super(status, code);
		this.referralId = referralId;
	}

	public Long getReferralId() {
		return referralId;
	}

	public void setReferralId(Long referralId) {
		this.referralId = referralId;
	}
}
