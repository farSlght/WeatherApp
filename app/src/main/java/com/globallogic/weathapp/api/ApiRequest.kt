package com.globallogic.weathapp.api

import com.globallogic.weathapp.data.model.WeatherData

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiRequest {

    @GET("3hourly/{username}")
    fun gettWeather3day(@Query("lat") lat: String,
                          @Query("lon") lon: String,
                          @Query("key") apiKey: String): Observable<WeatherData>
}
