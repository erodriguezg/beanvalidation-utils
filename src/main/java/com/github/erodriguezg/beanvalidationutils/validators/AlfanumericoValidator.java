package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.annotations.Alfanumerico;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AlfanumericoValidator extends AbstractValidator implements ConstraintValidator<Alfanumerico, String> {

    public void initialize(Alfanumerico a) {
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.textoAlfanumericoValido(value);
    }

}