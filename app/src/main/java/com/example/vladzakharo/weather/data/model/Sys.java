package com.example.vladzakharo.weather.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */

public class Sys {

    @SerializedName("type")
    private long type;

    @SerializedName("id")
    private long id;

    @SerializedName("message")
    private double message;

    @SerializedName("country")
    private String country;

    @SerializedName("sunrise")
    private long sunrise;

    @SerializedName("sunset")
    private long sunset;

    public long getSunset() {
        return sunset;
    }

    public long getType() {
        return type;
    }

    public long getId() {
        return id;
    }

    public double getMessage() {
        return message;
    }

    public String getCountry() {
        return country;
    }

    public long getSunrise() {
        return sunrise;
    }
}
