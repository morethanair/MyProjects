package com.morethanair.service;

import org.springframework.web.client.RestTemplate;

public class RestCallService {
	static public String getJsonResponse(String url) {
		RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(url, String.class);
	    
	    int from = result.indexOf("{");
	    int to = result.lastIndexOf("}");
	    return result.substring(from, to+1);
	}
}
