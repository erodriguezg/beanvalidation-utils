package com.github.erodriguezg.beanvalidationutils.annotations;

/**
 * Created by takeda on 03-01-16.
 */

import com.github.erodriguezg.beanvalidationutils.validators.AlfanumericoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author github
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = AlfanumericoValidator.class)
@Documented
public @interface Alfanumerico {
    String message() default "Por favor ingrese un valor alfanumerico";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}