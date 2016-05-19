package com.ptt.cts.tests.utils;

/**
 * Bean representing a response from the PTT API
 * @author stefandascalu
 *
 */
public class PTTResponse {
	private int responseCode;
	private String contentType;
	private String contentBody;

	public PTTResponse(int responseCode, String contentType, String contentBody) {
		super();
		this.responseCode = responseCode;
		this.contentType = contentType;
		this.contentBody = contentBody;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentBody() {
		return contentBody;
	}

	public void setContentBody(String contentBody) {
		this.contentBody = contentBody;
	}

	@Override
	public String toString() {
		return "PTTResponse [responseCode=" + responseCode + ", contentType=" + contentType + ", contentBody="
				+ contentBody + "]";
	}

}
