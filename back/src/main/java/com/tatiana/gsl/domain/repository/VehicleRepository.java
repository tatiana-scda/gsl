package com.tatiana.gsl.domain.repository;

import com.tatiana.gsl.domain.model.entity.Address;
import com.tatiana.gsl.domain.model.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>,
		JpaSpecificationExecutor<Vehicle> {
}
