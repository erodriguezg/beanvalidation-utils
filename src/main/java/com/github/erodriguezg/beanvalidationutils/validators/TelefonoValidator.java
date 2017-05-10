package com.github.erodriguezg.beanvalidationutils.validators;

import com.github.erodriguezg.beanvalidationutils.annotations.Telefono;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Eduardo on 24-02-2017.
 */
public class TelefonoValidator extends AbstractValidator implements ConstraintValidator<Telefono, String> {
    @Override
    public void initialize(Telefono telefono) {
        //vacio
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.trim().isEmpty()) {
            return true;
        }
        return validacionesUtils.telefonoValido(value);
    }
}
