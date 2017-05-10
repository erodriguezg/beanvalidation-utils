package com.github.erodriguezg.beanvalidationutils.annotations;

/**
 * Created by takeda on 03-01-16.
 */
import com.github.erodriguezg.beanvalidationutils.validators.FonoFijoValidator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = FonoFijoValidator.class)
@Documented
public @interface FonoFijo {
    String message() default "Por favor ingrese un teléfono fijo válido.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}