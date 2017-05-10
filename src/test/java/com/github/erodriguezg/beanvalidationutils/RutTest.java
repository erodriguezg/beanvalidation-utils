package com.github.erodriguezg.beanvalidationutils;

import com.github.erodriguezg.beanvalidationutils.annotations.Rut;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by takeda on 03-01-16.
 */
public class RutTest {

    class FooString {
        @Rut
        private final String rut;

        public FooString(String rut) {
            this.rut = rut;
        }
    }

    private Validator validator;

    @Before
    public void init() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        this.validator = vf.getValidator();
    }

    @Test
    public void validoString() {
        FooString validFoo = new FooString("11.111.111-1");
        Set<ConstraintViolation<FooString>> violations = this.validator.validate(validFoo);
        assertThat(violations).isEmpty();
    }

    @Test
    public void invalidoString() {
        FooString validFoo = new FooString("11.111.111-2");
        Set<ConstraintViolation<FooString>> violations = this.validator.validate(validFoo);
        assertThat(violations).hasSize(1);
    }

    @Test
    public void validoNull() {
        FooString validFoo = new FooString(null);
        Set<ConstraintViolation<FooString>> violations = this.validator.validate(validFoo);
        violations = this.validator.validate(validFoo);
        assertThat(violations).isEmpty();
    }
}
