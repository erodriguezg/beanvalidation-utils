package com.github.erodriguezg.beanvalidationutils.annotations;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.validators.RutValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = RutValidator.class)
@Documented
public @interface Rut {
    String message() default "Por favor ingrese RUT en formato correcto";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
