package com.example.vladzakharo.weather.presentation.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.Forecast;
import com.example.vladzakharo.weather.presentation.ForecastViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad Zakharo on 30.03.2017.
 */
public class ForecastAdapter extends RecyclerView.Adapter<ForecastViewHolder> {

    private List<Forecast> forecastList;

    public ForecastAdapter(@NonNull List<Forecast> forecast) {
        forecastList = new ArrayList<>(forecast);
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_forecast, parent, false);
        return new ForecastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        holder.onBindData(forecastList.get(position));
    }

    @Override
    public int getItemCount() {
        return forecastList.size();
    }

    public void addForecast(Forecast forecast) {
        forecastList.add(forecast);
        notifyDataSetChanged();
    }
}
