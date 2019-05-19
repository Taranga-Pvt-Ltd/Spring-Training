package com.emudhra.login.validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.emudhra.login.model.Register;
import com.emudhra.login.service.RegisterService;

@Component
public class RegisterValidator implements Validator {
    @Autowired
    private RegisterService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Register.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
    	Register register = (Register) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (register.getUsername().length() < 6 || register.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (userService.findByUsername(register.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (register.getPassword().length() < 8 || register.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!register.getPasswordConfirm().equals(register.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }
}
