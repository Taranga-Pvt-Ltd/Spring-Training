package com.emudhra.login.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.emudhra.login.model.Login;
import com.emudhra.login.model.Register;
import com.emudhra.login.repository.RegisterRepository;

import java.util.HashSet;
import java.util.Set;

public class RegisterDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private RegisterRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Register register = userRepository.findByUsername(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Login role : register.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails.User(register.getUsername(), register.getPassword(), grantedAuthorities);
    }
}
