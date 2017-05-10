package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.annotations.FonoMovil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FonoMovilValidator extends AbstractValidator implements ConstraintValidator<FonoMovil, String> {

    @Override
    public void initialize(FonoMovil constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.fonoMovilValido(value);
    }
}