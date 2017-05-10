package com.github.erodriguezg.beanvalidationutils.annotations;

/**
 * Created by takeda on 05-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.validators.PasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Documented
public @interface Password {
    String message() default "Por favor ingrese contraseña en formato correcto";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}