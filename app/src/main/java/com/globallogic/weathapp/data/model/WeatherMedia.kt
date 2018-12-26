package com.globallogic.weathapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
//import io.realm.RealmObject
//import io.realm.annotations.RealmClass

//@RealmClass
open class WeatherMedia /*: RealmObject()*/ {

    @SerializedName("icon")
    @Expose
    var icon: String? = null

    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null
}