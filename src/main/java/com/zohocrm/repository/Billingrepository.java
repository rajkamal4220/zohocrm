package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Billing;

public interface Billingrepository extends JpaRepository<Billing,Long> {

}
