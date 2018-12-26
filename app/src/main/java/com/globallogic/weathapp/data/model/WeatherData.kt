package com.globallogic.weathapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.List;


@RealmClass
open class WeatherData : RealmObject() {

        @SerializedName("datetime")
        @Expose
        var datetime : String? = null
        
        @SerializedName("ts")
        @Expose
        var ts:  String? = null
            
        @SerializedName("snow")
        @Expose
        var snow: Double? = null

        @SerializedName("snow_depth")
        @Expose
        var snowDepth: Integer? = null

        @SerializedName("snow6h")
        @Expose
        var snow6h: Double? = null

        @SerializedName("precip")
        @Expose
        var precip: Double? = null

        @SerializedName("precip6h")
        @Expose
        var precip6h: Double? = null

        @SerializedName("temp")
        @Expose
        var temp: Double? = null

        @SerializedName("dewpt")
        @Expose
        var dewpt: Integer? = null

        @SerializedName("app_temp")
        @Expose
        var appTemp: Double? = null

        @SerializedName("rh")
        @Expose
        var rh: Integer? = null

        @SerializedName("clouds")
        @Expose
        var clouds: Integer? = null

        @SerializedName("weather")
        @Expose
        var weather: WeatherMedia? = null;

        @SerializedName("slp")
        @Expose
        var slp: Double? = null

        @SerializedName("pres")
        @Expose
        var pres: Integer? = null

        @SerializedName("uv")
        @Expose
        var uv: Double? = null

        @SerializedName("ghi")
        @Expose
        var ghi: Integer? = null

        @SerializedName("dhi")
        @Expose
        var dhi: Integer? = null

        @SerializedName("dni")
        @Expose
        var dni: Integer? = null

        @SerializedName("vis")
        @Expose
        var vis: Integer? = null

        @SerializedName("pod")
        @Expose
        var pod: String? = null

        @SerializedName("pop")
        @Expose
        var pop: Integer? = null

        @SerializedName("wind_spd")
        @Expose
        var windSpd: Double? = null

        @SerializedName("wind_dir")
        @Expose
        var windDir: Integer? = null

        @SerializedName("wind_cdir")
        @Expose
        var windCdir: String? = null

        @SerializedName("wind_cdir_full")
        @Expose
        var windCdirFull: String? = null
}