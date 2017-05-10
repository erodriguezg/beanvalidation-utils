package com.github.erodriguezg.beanvalidationutils.validators;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.annotations.WebSite;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WebSiteValidator extends AbstractValidator implements ConstraintValidator<WebSite, String> {
    @Override
    public void initialize(WebSite constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return validacionesUtils.urlValida(value);
    }
}