package com.globallogic.weathapp.api

import android.util.Log
import com.globallogic.weathapp.data.model.WeatherbitResponce
import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.realm.RealmObject
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

object WeatherbitApi {

    private val TIME_OUT = (10 * 1000).toLong()

    private val BASE_URL = "https://api.weatherbit.io/v2.0/"
    private val API_KEY = "e7c124ee83e54a9caca0f8019ced80a8"

    private val gson = GsonBuilder()
//            .setExclusionStrategies(object : ExclusionStrategy {
//
//        override fun shouldSkipClass(clazz: Class<*>?): Boolean {
//            return false
//        }
//
//        override fun shouldSkipField(f: FieldAttributes?): Boolean {
////            return f?.declaredClass == RealmObject::class.java
//            return false
//        }
//
//    }
// )
.create()

    private val interceptor: HttpLoggingInterceptor =  HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BASIC)

    private val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

    private val request: Request? = Request.Builder()
            .url("https://api.weatherbit.io/v2.0/current?lat=49.782813&lon=23.9844537&key=e7c124ee83e54a9caca0f8019ced80a8")
            .get()
            .build()

    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create()) // todo add specialized gson if needed
            .build()

    private val apiService: ApiRequest = retrofit.create(ApiRequest::class.java)


    fun getWeather3day() {
        Log.d("Retrieved weather", "enetered method")
        apiService.getWeather3day(lat = "49.782813",
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

        Log.d("WeatheR", "okhttp method")
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) {
                var responceBody = response.body()?.string()
                Log.d("Retrieved weather",responceBody)
                var responce: WeatherbitResponce = gson.fromJson(responceBody, WeatherbitResponce::class.java)
                Log.d("weather lattitude", responce.toString())
            }
        })
    }
}
