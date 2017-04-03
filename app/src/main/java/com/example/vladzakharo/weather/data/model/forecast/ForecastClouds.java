package com.example.vladzakharo.weather.data.model.forecast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastClouds {

    @SerializedName("all")
    private int all;

    public int getAll() {
        return all;
    }
}
