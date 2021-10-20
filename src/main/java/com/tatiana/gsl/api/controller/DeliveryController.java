package com.tatiana.gsl.api.controller;

import com.tatiana.gsl.api.reponse.DeliveryResponse;
import com.tatiana.gsl.api.request.CreateUserRequest;
import com.tatiana.gsl.api.request.LoginRequest;
import com.tatiana.gsl.api.resource.DeliveryResource;
import com.tatiana.gsl.api.resource.UserResource;
import com.tatiana.gsl.domain.model.entity.Delivery;
import com.tatiana.gsl.domain.service.DeliveryService;
import com.tatiana.gsl.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DeliveryController implements DeliveryResource {

	private final DeliveryService service;

	/* *
	 * This endpoint will show delivery information
	 * */
	@Override
	public DeliveryResponse getDelivery(@RequestBody Integer id) {
		return service.getDelivery(id);
	}
}
