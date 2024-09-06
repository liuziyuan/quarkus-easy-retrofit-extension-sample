package io.github.liuziyuan;

import io.github.easyretrofit.core.builder.BaseConverterFactoryBuilder;
import jakarta.enterprise.context.ApplicationScoped;
import retrofit2.Converter;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * @author liuziyuan
 */
@ApplicationScoped
public class JacksonConvertFactoryBuilder extends BaseConverterFactoryBuilder {

    @Override
    public Converter.Factory buildConverterFactory() {
        return JacksonConverterFactory.create();
    }
}
