package com.agnyfonseca.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnyfonseca.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
