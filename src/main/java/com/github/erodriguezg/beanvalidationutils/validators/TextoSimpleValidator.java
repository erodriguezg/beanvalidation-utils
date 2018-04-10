package com.github.erodriguezg.beanvalidationutils.validators;

import com.github.erodriguezg.beanvalidationutils.annotations.TextoSimple;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TextoSimpleValidator extends AbstractValidator implements ConstraintValidator<TextoSimple, String> {

    @Override
    public void initialize(TextoSimple textoSimple) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.trim().isEmpty()) {
            return true;
        }
        return validacionesUtils.textoSimpleValido(value);
    }
}