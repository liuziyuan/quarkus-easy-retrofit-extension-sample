package io.github.liuziyuan;

import io.github.easyretrofit.core.OverrideRule;
import io.github.easyretrofit.core.annotation.RetrofitBuilder;
import io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime.PrintInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@RetrofitBuilder(baseUrl = "http://localhost:9100/", globalOverwriteRule = OverrideRule.GLOBAL_FIRST)
@PrintInfo
public interface BaseApi {

    @GET("backend/v1/hello/{message}")
    Call<ResponseBody> hello(@Path("message") String message);
}
