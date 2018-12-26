package com.globallogic.weathapp.api

import android.util.Log
import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.realm.RealmObject
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object WeatherbitApi {

    private val TIME_OUT = (10 * 1000).toLong()

    private val BASE_URL = "http://api.weatherbit.io/v2.0/forecast/"
    private val API_KEY = "e7c124ee83e54a9caca0f8019ced80a8"

    val gson = GsonBuilder().setExclusionStrategies(object : ExclusionStrategy {

        override fun shouldSkipClass(clazz: Class<*>?): Boolean {
            return false
        }

        override fun shouldSkipField(f: FieldAttributes?): Boolean {
            return f?.declaredClass == RealmObject::class.java
        }

    }).create()

    val retrofit: Retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(BASE_URL)
            .build()

    val apiService: ApiRequest = retrofit.create(ApiRequest::class.java)

    fun getWeather3day() {

        apiService.gettWeather3day(lat = "49.782813",
                                    lon = "23.9844537",
                                    apiKey = API_KEY)
                .subscribeOn(Schedulers.newThread()) //Schedulers.io()
                .observeOn(AndroidSchedulers.mainThread()) //AndroidSchedulers.mainThread()
                .subscribe(
                        { user ->

                          Log.d("Retrieved weather", user.toString())

                        },
                        { error ->

                            print("Realm Error: " + error.message)

                        }
                )
    }

}
