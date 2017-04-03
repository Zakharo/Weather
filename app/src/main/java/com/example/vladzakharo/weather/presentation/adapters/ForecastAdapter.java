package com.example.vladzakharo.weather.presentation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherList;
import com.example.vladzakharo.weather.domain.CurrentWeatherInteractor;
import com.example.vladzakharo.weather.presentation.ViewHolder;
import com.example.vladzakharo.weather.presentation.forecast.ForecastPresenter;

import java.util.ArrayList;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Vlad Zakharo on 30.03.2017.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ViewHolder> {

    private CurrentWeatherInteractor currentWeatherInteractor;
    private CompositeDisposable compositeDisposable;
    private ForecastPresenter presenter;
    private ArrayList<ForecastWeatherList> list;

    public ForecastAdapter(ForecastPresenter presenter, ArrayList<ForecastWeatherList> list) {
        currentWeatherInteractor = new CurrentWeatherInteractor();
        compositeDisposable = new CompositeDisposable();
        this.presenter = presenter;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        compositeDisposable.dispose();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
