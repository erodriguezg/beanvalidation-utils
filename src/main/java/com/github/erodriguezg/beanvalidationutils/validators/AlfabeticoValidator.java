package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.annotations.Alfabetico;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author github
 */
public class AlfabeticoValidator extends AbstractValidator implements ConstraintValidator<Alfabetico, String> {

    public void initialize(Alfabetico a) {
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.textoAlfabeticoValido(value);
    }

}
