package com.tatiana.gsl.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeliveryResponse {

    Integer deliveryId;

    String status;

    String productDescription;
}
