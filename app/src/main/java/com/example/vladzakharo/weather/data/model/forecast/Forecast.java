package com.example.vladzakharo.weather.data.model.forecast;

import com.example.vladzakharo.weather.data.model.common.Clouds;
import com.example.vladzakharo.weather.data.model.common.Weather;
import com.example.vladzakharo.weather.data.model.common.Wind;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */
public class Forecast {

    @SerializedName("dt")
    private String timeStamp;

    @SerializedName("main")
    private ForecastMain main;

    @SerializedName("weather")
    private List<Weather> weather;

    @SerializedName("clouds")
    private Clouds clouds;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("rain")
    private ForecastRain rain;

    @SerializedName("dt_txt")
    private String timeTxt;

    public String getTimeStamp() {
        return timeStamp;
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

    public String getTimeTxt() {
        return timeTxt;
    }

    public List<Weather> getWeather() {
        return weather;
    }
}
