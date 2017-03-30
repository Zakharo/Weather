package com.example.vladzakharo.weather.data.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */

public class ServiceApi {

    private static final String ENDPOINT = "http://api.openweathermap.org/data/2.5/";
    private static ServiceApi instance;

    private ServiceApi() {
    }

    public static ServiceApi getInstance() {
        if (instance == null) {
            instance = new ServiceApi();
        }
        return instance;
    }

    public Retrofit createRetrofitService() {
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(createOkHttpClient())
                .baseUrl(ENDPOINT)
                .build();
    }

    private static OkHttpClient createOkHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(logging);
        return builder.build();
    }
}
