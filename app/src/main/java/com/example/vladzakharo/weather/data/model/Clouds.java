package com.example.vladzakharo.weather.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class Clouds {

    @SerializedName("all")
    private double all;

    public double getAll() {
        return all;
    }
}
