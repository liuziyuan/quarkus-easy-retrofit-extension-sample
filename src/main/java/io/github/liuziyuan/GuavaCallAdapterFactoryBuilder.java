package io.github.liuziyuan;

import io.github.easyretrofit.core.builder.BaseCallAdapterFactoryBuilder;
import jakarta.enterprise.context.ApplicationScoped;
import retrofit2.CallAdapter;
import retrofit2.adapter.guava.GuavaCallAdapterFactory;

/**
 * @author liuziyuan
 */
@ApplicationScoped
public class GuavaCallAdapterFactoryBuilder extends BaseCallAdapterFactoryBuilder {

    @Override
    public CallAdapter.Factory buildCallAdapterFactory() {
        return GuavaCallAdapterFactory.create();
    }
}
