package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.annotations.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class EmailValidator extends AbstractValidator implements ConstraintValidator<Email, String> {

    @Override
    public void initialize(Email constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.emailValido(value);
    }
}
