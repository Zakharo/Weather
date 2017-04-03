package com.example.vladzakharo.weather.data.model.forecast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastWind {

    @SerializedName("speed")
    private String speed;

    @SerializedName("deg")
    private String deg;

    public String getSpeed() {
        return speed;
    }

    public String getDeg() {
        return deg;
    }
}
