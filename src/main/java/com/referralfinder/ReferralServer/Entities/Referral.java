package com.referralfinder.ReferralServer.Entities;

public class Referral {

	private int id;
	private String link;
	private String code;

	public Referral(int id, String link, String code) {
		this.id = id;
		this.link = link;
		this.code = code;
	}

	public Referral(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getLink() {
		return link;
	}

	public String getCode() {
		return code;
	}
}
