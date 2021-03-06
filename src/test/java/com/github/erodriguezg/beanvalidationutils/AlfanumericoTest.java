package com.github.erodriguezg.beanvalidationutils;

import com.github.erodriguezg.beanvalidationutils.annotations.Alfanumerico;
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
public class AlfanumericoTest {

    class Foo {
        @Alfanumerico
        private final String texto;

        public Foo(String rut) {
            this.texto = rut;
        }
    }

    private Validator validator;

    @Before
    public void init() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        this.validator = vf.getValidator();
    }

    @Test
    public void validoTest() {
        Foo foo = new Foo("abcdefghijklmnopqrstuvwxyz1234567890 ");
        Set<ConstraintViolation<Foo>> violations = this.validator.validate(foo);
        assertThat(violations).isEmpty();
    }

    @Test
    public void validoNuloTest() {
        Foo foo = new Foo(null);
        Set<ConstraintViolation<Foo>> violations = this.validator.validate(foo);
        assertThat(violations).isEmpty();
    }

    @Test
    public void invalidoTest() {
        Foo foo = new Foo("!#$%&");
        Set<ConstraintViolation<Foo>> violations = this.validator.validate(foo);
        assertThat(violations).hasSize(1);
    }
}
