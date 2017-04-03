package com.example.vladzakharo.weather.presentation;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.timeView)
    TextView timeView;

    @BindView(R.id.press)
    TextView pressureView;

    @BindView(R.id.hum)
    TextView humView;

    public ForecastViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindViewHolder(ForecastWeatherList item) {
        timeView.setText(item.getDt_txt());
        pressureView.setText(item.getMain().getPressure());
        humView.setText(item.getMain().getHumidity());
    }
}
