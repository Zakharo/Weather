package com.example.vladzakharo.weather.presentation;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vlad Zakharo on 03.04.2017.
 */

public class ForecastViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.cityView)
    TextView cityView;

    public ForecastViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
