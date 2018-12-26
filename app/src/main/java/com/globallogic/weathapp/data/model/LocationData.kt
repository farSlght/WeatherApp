package com.globallogic.weathapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
open class LocationData : RealmObject() {

    @SerializedName("city_name")
    @Expose
    var cityName: String? = null
    @SerializedName("state_code")
    @Expose
    var stateCode: String? = null
    @SerializedName("country_code")
    @Expose
    var countryCode: String? = null
    @SerializedName("lat")
    @Expose
    var lat: String? = null
    @SerializedName("lon")
    @Expose
    var lon: String? = null
    @SerializedName("timezone")
    @Expose
    var timezone: String? = null
    @SerializedName("data")
    @Expose
    var data: List<WeatherData>? = null
}