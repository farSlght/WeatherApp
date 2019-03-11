package com.globallogic.weathapp.api

import com.globallogic.weathapp.data.model.WeatherbitResponce
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRequest {

    @GET("current")
    fun getCurrentWeather(@Query("lat") lat: String,
                          @Query("lon") lon: String,
                          @Query("key") apiKey: String): Observable<WeatherbitResponce>

        @GET("3hourly")
    fun getWeather3Day(@Query("lat") lat: String,
                          @Query("lon") lon: String,
                          @Query("key") apiKey: String): Observable<WeatherbitResponce>


}
