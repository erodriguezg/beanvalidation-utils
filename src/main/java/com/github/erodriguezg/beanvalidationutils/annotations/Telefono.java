package com.github.erodriguezg.beanvalidationutils.annotations;

import com.github.erodriguezg.beanvalidationutils.validators.TelefonoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Eduardo on 24-02-2017.
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = TelefonoValidator.class)
public @interface Telefono {

    String message() default "Por favor ingrese un teléfono móvil o fijo válido.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
