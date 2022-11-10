package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.contact;

public interface Contactrepository extends JpaRepository<contact, Long> {

}
