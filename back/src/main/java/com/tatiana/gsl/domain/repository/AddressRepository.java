package com.tatiana.gsl.domain.repository;

import com.tatiana.gsl.domain.model.entity.Address;
import com.tatiana.gsl.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>,
		JpaSpecificationExecutor<Address> {
}
