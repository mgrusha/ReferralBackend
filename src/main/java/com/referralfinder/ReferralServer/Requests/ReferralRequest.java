package com.referralfinder.ReferralServer.Requests;

public class ReferralRequest {
	private String link;
	private String code;
	private String author;

	public ReferralRequest(String link, String code, String author) {
		this.link = link;
		this.code = code;
		this.author = author;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
