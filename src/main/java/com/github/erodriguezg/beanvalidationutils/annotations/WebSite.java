package com.github.erodriguezg.beanvalidationutils.annotations;

/**
 * Created by takeda on 03-01-16.
 */
import com.github.erodriguezg.beanvalidationutils.validators.WebSiteValidator;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = WebSiteValidator.class)
@Documented
public @interface WebSite {
    String message() default "Por favor ingrese formato correcto de sitio web 'http://www.nic.dominio'";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
