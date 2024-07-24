package org.play80days.annotation;

import org.play80days.dto.BaseDto;
import org.play80days.util.DataArgumentsProvider;

import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;

/**
 * @author tahanima
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(DataArgumentsProvider.class)
public @interface IDataSource {

    String id();

    String fileName();

    Class<? extends BaseDto> clazz();
}
