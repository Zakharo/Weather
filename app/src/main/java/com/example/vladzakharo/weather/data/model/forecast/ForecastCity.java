package com.example.vladzakharo.weather.data.model.forecast;

import com.example.vladzakharo.weather.data.model.daily.Coordinates;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */
public class ForecastCity {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("coord")
    private Coordinates coordinates;

    @SerializedName("country")
    private String country;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getCountry() {
        return country;
    }
}
