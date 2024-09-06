package io.github.liuziyuan;

import io.github.easyretrofit.core.OverrideRule;
import io.github.easyretrofit.core.annotation.RetrofitBuilder;
import io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime.PrintInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@RetrofitBuilder(baseUrl = "http://localhost:8081/", globalOverwriteRule = OverrideRule.GLOBAL_FIRST)
@PrintInfo
public interface BaseApi {

    @GET("/api/hello")
    Call<ResponseBody> hello();
}
