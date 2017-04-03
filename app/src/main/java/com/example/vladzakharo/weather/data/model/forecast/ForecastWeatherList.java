package com.example.vladzakharo.weather.data.model.forecast;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastWeatherList {

    @SerializedName("dt")
    private String dt;

    @SerializedName("main")
    private ForecastMain main;

    @SerializedName("weather")
    private ArrayList<ForecastWeather> weather;

    @SerializedName("clouds")
    private ForecastClouds clouds;

    @SerializedName("wind")
    private ForecastWind wind;

    @SerializedName("rain")
    private ForecastRain rain;

    @SerializedName("sys")
    private ForecastSys sys;

    @SerializedName("dt_txt")
    private String dt_txt;

    public String getDt() {
        return dt;
    }

    public ForecastMain getMain() {
        return main;
    }

    public ForecastClouds getClouds() {
        return clouds;
    }

    public ForecastWind getWind() {
        return wind;
    }

    public ForecastRain getRain() {
        return rain;
    }

    public ForecastSys getSys() {
        return sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public ArrayList<ForecastWeather> getWeather() {
        return weather;
    }
}
