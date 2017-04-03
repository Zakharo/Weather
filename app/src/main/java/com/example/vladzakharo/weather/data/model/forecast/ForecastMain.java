package com.example.vladzakharo.weather.data.model.forecast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */
public class ForecastMain {

    @SerializedName("temp")
    private String temperature;

    @SerializedName("temp_min")
    private String minTemperature;

    @SerializedName("temp_max")
    private String maxTemperature;

    @SerializedName("pressure")
    private String pressure;

    @SerializedName("sea_level")
    private String seaLevel;

    @SerializedName("grand_level")
    private String grandLevel;

    @SerializedName("humidity")
    private String humidity;

    @SerializedName("temp_kf")
    private String temperatureCoeff;

    public String getTemperature() {
        return temperature;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public String getPressure() {
        return pressure;
    }

    public String getSeaLevel() {
        return seaLevel;
    }

    public String getGrandLevel() {
        return grandLevel;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTemperatureCoeff() {
        return temperatureCoeff;
    }
}
