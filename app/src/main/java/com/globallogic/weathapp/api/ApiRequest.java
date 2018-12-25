package com.globallogic.weathapp.api;

import com.globallogic.weathapp.data.model.WeatherData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiRequest {

    @GET("3hourly/{username}")
    Observable<WeatherData> getCurrentWeather(@Query("lat") String lat,
                                              @Query("lon") String lon,
                                              @Query("key") String apiKey);
}
