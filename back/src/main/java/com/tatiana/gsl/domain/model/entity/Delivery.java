package com.tatiana.gsl.domain.model.entity;

import com.tatiana.gsl.domain.enumerator.DeliveryStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@With
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "delivery")
public class Delivery {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "status")
    private String status;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "route_id")
    private Integer routeId;
}
