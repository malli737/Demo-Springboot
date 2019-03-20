package com.malli.SprinDemo.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.malli.SprinDemo.pojo.Quoterresponse;

@RestController
public class WelcomeController 
{
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/cws")
	String consumeWebService() {
		
		RestTemplate restTemplate = new RestTemplate();
		Quoterresponse quote =restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quoterresponse.class);
		return quote.toString();
	}


}
