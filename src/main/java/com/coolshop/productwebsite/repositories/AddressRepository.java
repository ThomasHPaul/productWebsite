package com.coolshop.productwebsite.repositories;

import com.coolshop.productwebsite.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
