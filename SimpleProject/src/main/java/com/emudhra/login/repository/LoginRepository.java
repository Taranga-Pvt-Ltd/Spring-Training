package com.emudhra.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emudhra.login.model.Login;


public interface LoginRepository extends JpaRepository<Login, Long>{
}
