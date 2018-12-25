package com.globallogic.weathapp.forecast.utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.globallogic.weathapp.R;

class WeatherViewHolder extends RecyclerView.ViewHolder {
    TextView temperature;

    public WeatherViewHolder(@NonNull View itemView) {
        super(itemView);
        temperature = itemView.findViewById(R.id.temperature);
    }
}
