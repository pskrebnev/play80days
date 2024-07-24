package org.play80days.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.play80days.dto.BaseDto;
import org.play80days.util.DataArgumentsProvider;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(DataArgumentsProvider.class)
public @interface IDataSource {

  String id();

  String fileName();

  Class<? extends BaseDto> clazz();
}
