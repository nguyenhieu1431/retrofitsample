package com.nnhieu.sample;

import java.io.IOException;
import java.nio.channels.Channel;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 12/26/2016.
 */

public class ServiceHelper {
    private static String BASE_URL = "http://polls.apiblueprint.org";
    private static OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create());

    public static <S> S initService(Class<S> serviceClass) {
        clientBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Request.Builder builder = request.newBuilder().addHeader("Content-Type", "application/json").method(request.method(), request.body());
                Request newRequest = builder.build();
                return chain.proceed(newRequest);
            }
        });
        return retrofitBuilder.client(clientBuilder.build()).build().create(serviceClass);
    }

}
