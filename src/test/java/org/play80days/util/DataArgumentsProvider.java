package org.play80days.util;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;
import org.play80days.annotation.IDataSource;
import org.play80days.config.ConfigurationManager;
import org.play80days.dto.BaseDto;

public class DataArgumentsProvider implements ArgumentsProvider, AnnotationConsumer<IDataSource> {

  private String id;
  private String fileName;
  private Class<? extends BaseDto> clazz;

  @Override
  public void accept(final IDataSource source) {
    id = source.id();
    fileName = ConfigurationManager.config().baseTestDataPath() + source.fileName();
    clazz = source.clazz();
  }

  @Override
  public Stream<? extends Arguments> provideArguments(final ExtensionContext context) {
    return Stream.of(CsvToDtoMapper.map(clazz, fileName, id)).map(Arguments::of);
  }
}
