package com.example.vladzakharo.weather.presentation.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.WeatherData;
import com.example.vladzakharo.weather.domain.CurrentWeatherInteractor;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Vlad Zakharo on 30.03.2017.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastHolder> {

    private CurrentWeatherInteractor currentWeatherInteractor;
    private CompositeDisposable compositeDisposable;

    public ForecastAdapter() {
        currentWeatherInteractor = new CurrentWeatherInteractor();
        compositeDisposable = new CompositeDisposable();
    }

    @Override
    public ForecastHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_item, parent, false);

        return new ForecastHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ForecastHolder holder, int position) {
        compositeDisposable.add(currentWeatherInteractor.getWeatherByCityId("627904")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<WeatherData>() {
                    @Override
                    public void accept(WeatherData weatherData) throws Exception {
                        holder.cityView.setText(weatherData.getName());
                    }
                }));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ForecastHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cityView)
        TextView cityView;

        public ForecastHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
