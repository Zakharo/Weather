package com.example.vladzakharo.weather.presentation.adapters;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.Forecast;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */
public class ForecastViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_time)
    TextView timeView;

    @BindView(R.id.text_max_temp)
    TextView maxTempView;

    @BindView(R.id.text_min_temp)
    TextView minTempView;

    @BindView(R.id.text_description)
    TextView descriptionView;

    @BindView(R.id.text_wind)
    TextView windView;

    @BindView(R.id.text_clouds)
    TextView cloudsView;

    @BindView(R.id.text_pressure)
    TextView pressureView;

    @BindView(R.id.image_weather)
    ImageView imageView;

    private StringBuilder stringBuilder;
    private Resources resources = itemView.getContext().getResources();
    private String textToShow;

    public ForecastViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void onBindData(@NonNull Forecast item) {
        String icon = item.getWeather().get(0).getIcon();
        if (!TextUtils.isEmpty(icon)) {
            Picasso.with(itemView.getContext())
                    .load("http://openweathermap.org/img/w/"+icon+".png")
                    .resize(200, 200)
                    .into(imageView);
        }
        String timeTxt = item.getTimeTxt();
        if (!TextUtils.isEmpty(timeTxt)) {
            formatDate(timeTxt);
        }
        String maxTemperature = item.getMain().getMaxTemperature();
        if (!TextUtils.isEmpty(maxTemperature)) {
            textToShow = String.format(resources.getString(R.string.temperature), maxTemperature);
            maxTempView.setText(textToShow);
        }

        String minTemperature = item.getMain().getMinTemperature();
        if (!TextUtils.isEmpty(minTemperature)) {
            textToShow = String.format(resources.getString(R.string.temperature), minTemperature);
            minTempView.setText(textToShow);
        }

        String description = item.getWeather().get(0).getDescription();
        if (!TextUtils.isEmpty(description)) {
            descriptionView.setText(description);
        }
        double wind = item.getWind().getSpeed();
        String stringWind = String.valueOf(wind);
        if (!TextUtils.isEmpty(String.valueOf(wind))) {
            textToShow = String.format(resources.getString(R.string.wind), stringWind);
            windView.setText(textToShow);
        }
        double clouds = item.getClouds().getAll();
        String stringClouds = String.valueOf(clouds);
        if (!TextUtils.isEmpty(String.valueOf(clouds))) {
            textToShow = String.format(resources.getString(R.string.clouds), stringClouds);
            cloudsView.setText(textToShow);
        }
        String pressure = item.getMain().getPressure();
        if (!TextUtils.isEmpty(pressure)) {
            textToShow = String.format(resources.getString(R.string.pressure), pressure);
            pressureView.setText(textToShow);
        }
    }

    private void formatDate(String date) {
        stringBuilder = new StringBuilder(date);
        stringBuilder.delete(0, 10);
        stringBuilder.delete(5, 8);
        timeView.setText(stringBuilder);
    }
}
