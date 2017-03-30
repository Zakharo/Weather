package com.example.vladzakharo.weather.data.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */

public class ServiceFactory {
    /*public static Retrofit createRetrofitService(final String endpoint) {
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(createOkHttpClient())
                .baseUrl(endpoint)
                .build();
    }*/

    public static WeatherService createWeatherService() {
        return ServiceApi.getInstance()
                .createRetrofitService()
                .create(WeatherService.class);
        //return retrofit.create(WeatherService.class);
    }

    /*private static OkHttpClient createOkHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(logging);
        return builder.build();
    }*/
}
