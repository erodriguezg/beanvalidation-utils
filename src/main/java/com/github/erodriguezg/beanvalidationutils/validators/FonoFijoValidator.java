package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.annotations.FonoFijo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class FonoFijoValidator extends AbstractValidator implements ConstraintValidator<FonoFijo, String> {

    @Override
    public void initialize(FonoFijo constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.fonoFijoNacional(value);
    }
}