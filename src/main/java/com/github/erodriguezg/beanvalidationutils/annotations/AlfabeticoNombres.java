package com.github.erodriguezg.beanvalidationutils.annotations;

/**
 * Created by rdiaz on 05-06-18.
 */

import com.github.erodriguezg.beanvalidationutils.validators.AlfabeticoNombresValidator;
import com.github.erodriguezg.beanvalidationutils.validators.AlfanumericoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author rdiaz
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = AlfabeticoNombresValidator.class)
@Documented
public @interface AlfabeticoNombres {
    String message() default "Por favor ingrese un nombre válido.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}