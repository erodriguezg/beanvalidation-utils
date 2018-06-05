package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by rdiaz on 05-06-18.
 */

import com.github.erodriguezg.beanvalidationutils.annotations.Alfabetico;
import com.github.erodriguezg.beanvalidationutils.annotations.AlfabeticoNombres;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author rdiaz
 */
public class AlfabeticoNombresValidator extends AbstractValidator implements ConstraintValidator<AlfabeticoNombres, String> {

    public void initialize(AlfabeticoNombres a) {
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.textoAlfabeticoParaNombresValido(value);
    }

}
