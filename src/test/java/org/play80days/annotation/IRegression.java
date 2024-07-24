package org.play80days.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.*;

/**
 * @author tahanima
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("regression")
public @interface IRegression {}
