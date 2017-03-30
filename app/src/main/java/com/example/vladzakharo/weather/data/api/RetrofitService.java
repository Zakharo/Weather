package com.example.vladzakharo.weather.data.api;

import com.example.vladzakharo.weather.BuildConfig;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */
public class RetrofitService {

    private static RetrofitService instance;
    private static Retrofit retrofit;

    private RetrofitService() {
    }

    public static RetrofitService getInstance() {
        if (instance == null) {
            synchronized (RetrofitService.class) {
                if (instance == null) {
                    instance = new RetrofitService();
                    retrofit = createRetrofitService();
                }
            }
        }
        return instance;
    }

    private static Retrofit createRetrofitService() {
        retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(createOkHttpClient())
                .baseUrl(BuildConfig.BASE_URL)
                .build();
        return retrofit;
    }

    public Retrofit getRetrofitService() {
        return retrofit;
    }

    private static OkHttpClient createOkHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(logging);
        return builder.build();
    }
}
