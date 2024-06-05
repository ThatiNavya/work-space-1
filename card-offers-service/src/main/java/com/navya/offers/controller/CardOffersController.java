package com.navya.offers.controller;

import org.springframework.web.bind.annotation.RestController;

import com.navya.offers.builder.CardOffersRequestBuilder;
import com.navya.offers.builder.CardOffersResponseBuilder;
import com.navya.offers.model.CardOffersRequest;
import com.navya.offers.model.CardOffersResponse;
import com.navya.offers.model.CardOffersServiceRequest;
import com.navya.offers.model.CardOffersServiceResponse;
import com.navya.offers.service.CardOffersService;
import com.navya.offers.validator.CardOffersValidator;

@RestController
public class CardOffersController { // controlling

	public CardOffersResponse getOffers(CardOffersRequest request) {

		//1.get the request from client
		//2.validate the request--100 lines
		CardOffersValidator validator = new CardOffersValidator();
		validator.validateRequest(request);
		       
		//3. prepare the request for service class
		CardOffersRequestBuilder reqBuilder = new CardOffersRequestBuilder();
		CardOffersServiceRequest svcRequest =reqBuilder.buildServiceRequest(request);
	   //CardOffersServiceRequest svcRequest = new CardOffersServiceRequest();
	
		//4. call service class
				CardOffersService service = new CardOffersService();
				CardOffersServiceResponse response = service.getOffers(svcRequest);
				
		//5.prepare the controller response
		CardOffersResponseBuilder respBuilder = new CardOffersResponseBuilder();
		CardOffersResponse offerResponse = respBuilder.buildControllerRes(response);
		
		return offerResponse;
		
	}
}