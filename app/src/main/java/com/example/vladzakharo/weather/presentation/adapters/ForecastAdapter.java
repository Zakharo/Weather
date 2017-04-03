package com.example.vladzakharo.weather.presentation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherList;
import com.example.vladzakharo.weather.presentation.ForecastViewHolder;

import java.util.ArrayList;

/**
 * Created by Vlad Zakharo on 30.03.2017.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastViewHolder> {

    private ArrayList<ForecastWeatherList> list;

    public ForecastAdapter(ArrayList<ForecastWeatherList> list) {
        this.list = list;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_item, parent, false);
        return new ForecastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        holder.bindViewHolder(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
