package com.globallogic.weathapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.List;


@RealmClass
open class WeatherData : RealmObject() {
    

    // class Datum {

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
        var weather: Weather? = null;

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

//    }

    class Example {

        @SerializedName("city_name")
        @Expose
        var String cityName;
        @SerializedName("state_code")
        @Expose
        var String stateCode;
        @SerializedName("country_code")
        @Expose
        var String countryCode;
        @SerializedName("lat")
        @Expose
        var String lat;
        @SerializedName("lon")
        @Expose
        var String lon;
        @SerializedName("timezone")
        @Expose
        var String timezone;
        @SerializedName("data")
        @Expose
        var List<Datum> data = null;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getStateCode() {
            return stateCode;
        }

        public void setStateCode(String stateCode) {
            this.stateCode = stateCode;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

    }


    class Weather {

        @SerializedName("icon")
        @Expose
        var String icon;
        @SerializedName("code")
        @Expose
        var String code;
        @SerializedName("description")
        @Expose
        var String description;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }


    @PrimaryKey
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("login")
    @Expose
    var login: String? = null

    @SerializedName("avatar_url")
    @Expose
    var avatar_url: String? = null

}