package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by takeda on 03-01-16.
 */
import com.github.erodriguezg.beanvalidationutils.annotations.Rut;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RutValidator extends AbstractValidator implements ConstraintValidator<Rut, String> {

    @Override
    public void initialize(Rut constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null) {
            return true;
        }
        return validacionesUtils.validarRut(value);
    }

}