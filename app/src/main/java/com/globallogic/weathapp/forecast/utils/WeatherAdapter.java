package com.globallogic.weathapp.forecast.utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.globallogic.weathapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder>{

    private List<String> data = new ArrayList<String>() {{ add("One"); add("One"); add("One"); add("One");
                                            add("One"); add("One"); add("One"); }};

    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.view_weather_item, viewGroup,false);
        WeatherViewHolder viewHolder = new WeatherViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder viewHolder, int i) {
        viewHolder.temperature.setText(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
