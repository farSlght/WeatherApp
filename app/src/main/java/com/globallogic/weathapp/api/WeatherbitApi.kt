package com.globallogic.weathapp.api

import android.util.Log
import com.globallogic.weathapp.WeatherApplication
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object WeatherbitApi {

    private val BASE_URL = "https://api.weatherbit.io/v2.0/"
    private val API_KEY = "e7c124ee83e54a9caca0f8019ced80a8"

    private val gson = GsonBuilder().create()

    private val interceptor: HttpLoggingInterceptor =  HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BASIC)

    private val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create()) // todo add specialized gson if needed
            .build()

    private val apiService: ApiRequest = retrofit.create(ApiRequest::class.java)


    fun getWeather3day() {
        var lattitude: String = WeatherApplication.getLocationLatitude()
        var longitude: String = WeatherApplication.getLocationLongitude()

        apiService.getWeather3day(lat = lattitude,
                                    lon = longitude,
                                    apiKey = API_KEY)
                .subscribeOn(Schedulers.newThread()) //Schedulers.io()
                .observeOn(AndroidSchedulers.mainThread()) //AndroidSchedulers.mainThread()
                .subscribe(
                        { user ->

                          Log.d("Retrieved weather count", user.count.toString())

                        },
                        { error ->

                            print("Realm Error: " + error.message)

                        }
                )
    }
}
