package io.github.liuziyuan;

import io.github.easyretrofit.core.RetrofitResourceContext;
import io.quarkiverse.retrofit.runtime.EnableRetrofit;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;

@EnableRetrofit(value = "io.github.liuziyuan")
@Path("/hello")
public class ExampleResource {

    @Inject
    RetrofitResourceContext context;
    @Inject
    BaseApi baseApi;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {
        String string = baseApi.hello("world").execute().toString();
        return "Hello from Quarkus REST";
    }
}
