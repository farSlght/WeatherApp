package com.globallogic.weathapp.data.model

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.globallogic.weathapp.api.WeatherbitApi
import io.realm.RealmList

class WeatherViewModel : ViewModel(){
    val currentWeather : MutableLiveData<RealmList<WeatherData>> by lazy {
        MutableLiveData<RealmList<WeatherData>>()
    }

    fun updateWeather(){
        WeatherbitApi.updateCurrentWeather()
                .subscribe({
                    newData -> currentWeather.postValue(newData)
                    ///TODO: save news to database
                })
    }
}