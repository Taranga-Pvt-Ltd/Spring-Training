package com.emudhra.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emudhra.login.model.Register;


public interface RegisterRepository extends JpaRepository<Register, Long> {
    Register findByUsername(String username);
}

