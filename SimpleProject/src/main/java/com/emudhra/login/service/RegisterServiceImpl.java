package com.emudhra.login.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.emudhra.login.model.Register;
import com.emudhra.login.repository.LoginRepository;
import com.emudhra.login.repository.RegisterRepository;


@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepository userRepository;
    @Autowired
    private LoginRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Register user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public Register findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
