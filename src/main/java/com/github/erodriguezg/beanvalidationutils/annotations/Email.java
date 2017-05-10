package com.github.erodriguezg.beanvalidationutils.annotations;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.validators.EmailValidator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface Email {
    String message() default "Por favor ingrese email en formato correcto sunombre@ejemplo.com";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}