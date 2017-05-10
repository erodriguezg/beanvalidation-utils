package com.github.erodriguezg.beanvalidationutils.validators;


import com.github.erodriguezg.javautils.ValidacionesUtils;

public abstract class AbstractValidator {

    protected final ValidacionesUtils validacionesUtils;

    public AbstractValidator() {
        this.validacionesUtils = new ValidacionesUtils();
    }

}
