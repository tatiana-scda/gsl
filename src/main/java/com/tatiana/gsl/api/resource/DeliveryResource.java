package com.tatiana.gsl.api.resource;

import com.tatiana.gsl.api.reponse.DeliveryResponse;
import com.tatiana.gsl.api.request.CreateUserRequest;
import com.tatiana.gsl.api.request.LoginRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(path = "/v1/delivery")
public interface DeliveryResource {

	@GetMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	DeliveryResponse getDelivery(@RequestBody Integer id);
}
