package com.example.vladzakharo.weather.presentation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherInformation;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */
public class ForecastViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_time)
    TextView timeView;

    @BindView(R.id.text_pressure)
    TextView pressureView;

    @BindView(R.id.text_humidity)
    TextView humidityView;

    public ForecastViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void onBindData(@NonNull ForecastWeatherInformation item) {
        if (item.getDtTxt() != null) {
            timeView.setText(item.getDtTxt());
        }
        if (item.getMain().getPressure() != null) {
            pressureView.setText(item.getMain().getPressure());
        }
        if (item.getMain().getHumidity() != null) {
            humidityView.setText(item.getMain().getHumidity());
        }
    }
}
