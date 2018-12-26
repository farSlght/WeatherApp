package com.globallogic.weathapp.api

import com.globallogic.weathapp.data.model.WeatherData
import com.globallogic.weathapp.data.model.WeatherbitResponce

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiRequest {

    @GET("current")
    fun getWeather3day(@Query("lat") lat: String,
                       @Query("lon") lon: String,
                       @Query("key") apiKey: String): Observable<WeatherbitResponce>
}
