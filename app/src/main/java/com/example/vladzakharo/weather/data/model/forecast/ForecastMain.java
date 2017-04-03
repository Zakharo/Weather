package com.example.vladzakharo.weather.data.model.forecast;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastMain {

    @SerializedName("temp")
    private String temp;

    @SerializedName("temp_min")
    private String temp_min;

    @SerializedName("temp_max")
    private String temp_max;

    @SerializedName("pressure")
    private String pressure;

    @SerializedName("sea_level")
    private String sea_level;

    @SerializedName("grand_level")
    private String grand_level;

    @SerializedName("humidity")
    private String humidity;

    @SerializedName("temp_kf")
    private String temp_kf;

    public String getTemp() {
        return temp;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public String getPressure() {
        return pressure;
    }

    public String getSea_level() {
        return sea_level;
    }

    public String getGrand_level() {
        return grand_level;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTemp_kf() {
        return temp_kf;
    }
}
