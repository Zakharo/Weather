package com.example.vladzakharo.weather.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */

public class WeatherData {

    @SerializedName("coord")
    private Coordinates coord;

    @SerializedName("weather")
    private List<Weather> weather;

    @SerializedName("base")
    private String base;

    @SerializedName("main")
    private Main main;

    @SerializedName("visibility")
    private Integer visibility;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("clouds")
    private Clouds clouds;

    @SerializedName("dt")
    private Integer dt;

    @SerializedName("sys")
    private Sys sys;

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("cod")
    private Integer cod;

    public Coordinates getCoord() {
        return coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
