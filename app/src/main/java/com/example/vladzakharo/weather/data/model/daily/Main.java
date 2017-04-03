package com.example.vladzakharo.weather.data.model.daily;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class Main {

    @SerializedName("temp")
    private double temperature;

    @SerializedName("pressure")
    private double pressure;

    @SerializedName("humidity")
    private double humidity;

    @SerializedName("temp_min")
    private double temperatureMin;

    @SerializedName("temp_max")
    private double temperatureMax;

    public double getTempMax() {
        return temperatureMax;
    }

    public double getTemp() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getTempMin() {
        return temperatureMin;
    }
}
