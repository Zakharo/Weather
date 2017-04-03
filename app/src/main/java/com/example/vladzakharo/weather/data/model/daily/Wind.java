package com.example.vladzakharo.weather.data.model.daily;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class Wind {

    @SerializedName("speed")
    private double speed;

    @SerializedName("deg")
    private double deg;

    @SerializedName("gust")
    private double gust;

    public double getSpeed() {
        return speed;
    }

    public double getDeg() {
        return deg;
    }

    public double getGust() {
        return gust;
    }
}
