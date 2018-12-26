package com.globallogic.weathapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class WeatherbitResponce {

    @SerializedName("data")
    @Expose
    var data: List<WeatherData>? = null
}