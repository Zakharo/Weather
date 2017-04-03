package com.example.vladzakharo.weather.data.model.forecast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastCoordinates {

    @SerializedName("lat")
    private double latitiude;

    @SerializedName("log")
    private double longitude;

    public double getLatitiude() {
        return latitiude;
    }

    public double getLongitude() {
        return longitude;
    }
}
