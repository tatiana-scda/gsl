package com.tatiana.gsl.domain.repository;

import com.tatiana.gsl.domain.model.entity.Address;
import com.tatiana.gsl.domain.model.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer>,
		JpaSpecificationExecutor<Delivery> {
}
