package com.emudhra.login.service;

import com.emudhra.login.model.Register;

public interface RegisterService {
    void save(Register reg);

    Register findByUsername(String username);
}
