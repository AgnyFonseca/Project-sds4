package com.agnyfonseca.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agnyfonseca.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
