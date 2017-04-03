package com.example.vladzakharo.weather.data.model.forecast;

import com.example.vladzakharo.weather.data.model.daily.Clouds;
import com.example.vladzakharo.weather.data.model.daily.Wind;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */
public class ForecastWeatherInformation {

    @SerializedName("dt")
    private String dt;

    @SerializedName("main")
    private ForecastMain main;

    @SerializedName("weather")
    private List<ForecastWeather> weather;

    @SerializedName("clouds")
    private Clouds clouds;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("rain")
    private ForecastRain rain;

    @SerializedName("dt_txt")
    private String dtTxt;

    public String getDt() {
        return dt;
    }

    public ForecastMain getMain() {
        return main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public ForecastRain getRain() {
        return rain;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public List<ForecastWeather> getWeather() {
        return weather;
    }
}
