package com.example.vladzakharo.weather.presentation.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherInformation;
import com.example.vladzakharo.weather.presentation.ForecastViewHolder;

import java.util.List;

/**
 * Created by Vlad Zakharo on 30.03.2017.
 */
public class ForecastAdapter extends RecyclerView.Adapter<ForecastViewHolder> {

    private List<ForecastWeatherInformation> forecastWeatherList;

    public ForecastAdapter(@NonNull List<ForecastWeatherInformation> forecastWeatherList) {
        this.forecastWeatherList = forecastWeatherList;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_forecast, parent, false);
        return new ForecastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        holder.onBindData(forecastWeatherList.get(position));
    }

    @Override
    public int getItemCount() {
        return forecastWeatherList.size();
    }
}
