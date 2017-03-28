package com.example.vladzakharo.weather.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */

public class Coordinates {

    @SerializedName("lon")
    private double longitude;

    @SerializedName("lat")
    private double latitude;


    public double getLon() {
        return longitude;
    }

    public double getLat() {
        return latitude;
    }
}
