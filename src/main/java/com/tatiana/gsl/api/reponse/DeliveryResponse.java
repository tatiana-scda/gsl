package com.tatiana.gsl.api.reponse;

import com.tatiana.gsl.domain.enumerator.DeliveryStatus;
import com.tatiana.gsl.domain.model.entity.Product;
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
