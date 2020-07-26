package com.referralfinder.ReferralServer.responses;

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
