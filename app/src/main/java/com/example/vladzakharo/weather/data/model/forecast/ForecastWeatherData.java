package com.example.vladzakharo.weather.data.model.forecast;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastWeatherData {

    @SerializedName("cod")
    private String cod;

    @SerializedName("message")
    private String message;

    @SerializedName("cnt")
    private int cnt;

    @SerializedName("list")
    private ArrayList<ForecastWeatherList> list;

    @SerializedName("city")
    private ForecastCity city;

    public String getCod() {
        return cod;
    }

    public String getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public ArrayList<ForecastWeatherList> getList() {
        return list;
    }

    public ForecastCity getCity() {
        return city;
    }
}
