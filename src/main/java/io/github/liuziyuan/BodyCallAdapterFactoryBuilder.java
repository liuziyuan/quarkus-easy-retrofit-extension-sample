package io.github.liuziyuan;

import io.github.easyretrofit.adapter.simplebody.SimpleBodyCallAdapterFactory;
import io.github.easyretrofit.core.builder.BaseCallAdapterFactoryBuilder;
import jakarta.enterprise.context.ApplicationScoped;
import retrofit2.CallAdapter;

@ApplicationScoped
public class BodyCallAdapterFactoryBuilder extends BaseCallAdapterFactoryBuilder {
    @Override
    public CallAdapter.Factory buildCallAdapterFactory() {
        return SimpleBodyCallAdapterFactory.create();
    }
}
