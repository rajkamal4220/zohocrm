package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}
