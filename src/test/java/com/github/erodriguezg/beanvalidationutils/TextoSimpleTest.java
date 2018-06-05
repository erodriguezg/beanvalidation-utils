package com.github.erodriguezg.beanvalidationutils;

import com.github.erodriguezg.beanvalidationutils.annotations.TextoSimple;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class TextoSimpleTest {

    class Foo{
        @TextoSimple
        private final String text;
        public Foo(String texto) {
            this.text = texto;
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
        TextoSimpleTest.Foo foo = new TextoSimpleTest.Foo("Mensaje : Sr. Ñoño Pingüino, buenos días!.");
        Set<ConstraintViolation<TextoSimpleTest.Foo>> violations = this.validator.validate(foo);
        assertThat(violations).isEmpty();
    }

    @Test
    public void validoNuloTest() {
        TextoSimpleTest.Foo foo = new TextoSimpleTest.Foo(null);
        Set<ConstraintViolation<TextoSimpleTest.Foo>> violations = this.validator.validate(foo);
        assertThat(violations).isEmpty();
    }

    @Test
    public void invalidoTest() {
        TextoSimpleTest.Foo foo = new TextoSimpleTest.Foo("Mensaje con caracteres no permitidos : @$%#");
        Set<ConstraintViolation<TextoSimpleTest.Foo>> violations = this.validator.validate(foo);
        assertThat(violations).hasSize(1);
    }
}