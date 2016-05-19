package com.ptt.cts.tests.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class RestClient {
	private String urlToService;
	private URL url;

	public RestClient(String urlToService) throws MalformedURLException {
		this.urlToService = urlToService;
		this.url = new URL(urlToService);
	}

	public String getUrlToService() {
		return urlToService;
	}

	public void setUrlToService(String urlToService) {
		this.urlToService = urlToService;
	}

	public PTTResponse doRequest(String contentType, String authorizationHeader, PTTObject objectToSend, boolean auth,
			String requestMethod) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setRequestMethod(requestMethod);
		connection.setRequestProperty("Content-Type", contentType);
		if (auth == true) {
			connection.setRequestProperty("Authorization", "Bearer " + authorizationHeader);
		}
		if(objectToSend != null){
			Gson gson = new Gson();
			String json = gson.toJson(objectToSend);
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
			out.write(json);
			out.close();
		}
		

		int responseCode = connection.getResponseCode();
		String responseContentType = connection.getContentType();

		if (responseCode / 100 != 2) {
			return new PTTResponse(responseCode, responseContentType, null);
		} else {
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			String responseBody = response.toString();

			return new PTTResponse(responseCode, responseContentType, responseBody);
		}

	}

}
