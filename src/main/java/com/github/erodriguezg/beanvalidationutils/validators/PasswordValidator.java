package com.github.erodriguezg.beanvalidationutils.validators;

import com.github.erodriguezg.beanvalidationutils.annotations.Password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PasswordValidator extends AbstractValidator implements ConstraintValidator<Password, String> {


    @Override
    public void initialize(Password constraintAnnotation) {
        //empty
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.passwordValido(value);
    }
}
