package com.globallogic.weathapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import io.realm.RealmModel;
import io.realm.annotations.RealmClass;

@RealmClass
public class WeatherData implements RealmModel {

        @SerializedName("wind_cdir")
        @Expose
        private String windCdir;
        @SerializedName("rh")
        @Expose
        private Double rh;
        @SerializedName("pod")
        @Expose
        private String pod;
        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("pres")
        @Expose
        private Double pres;
        @SerializedName("timezone")
        @Expose
        private String timezone;
        @SerializedName("ob_time")
        @Expose
        private String obTime;
        @SerializedName("country_code")
        @Expose
        private String countryCode;
        @SerializedName("clouds")
        @Expose
        private Double clouds;
        @SerializedName("vis")
        @Expose
        private Double vis;
        @SerializedName("solar_rad")
        @Expose
        private Double solarRad;
        @SerializedName("state_code")
        @Expose
        private String stateCode;
        @SerializedName("wind_spd")
        @Expose
        private Double windSpd;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("wind_cdir_full")
        @Expose
        private String windCdirFull;
        @SerializedName("slp")
        @Expose
        private Double slp;
        @SerializedName("datetime")
        @Expose
        private String datetime;
        @SerializedName("ts")
        @Expose
        private Double ts;
        @SerializedName("station")
        @Expose
        private String station;
        @SerializedName("h_angle")
        @Expose
        private Double hAngle;
        @SerializedName("dewpt")
        @Expose
        private Double dewpt;
        @SerializedName("uv")
        @Expose
        private Double uv;
        @SerializedName("dni")
        @Expose
        private Double dni;
        @SerializedName("wind_dir")
        @Expose
        private Double windDir;
        @SerializedName("elev_angle")
        @Expose
        private Double elevAngle;
        @SerializedName("ghi")
        @Expose
        private Double ghi;
        @SerializedName("dhi")
        @Expose
        private Double dhi;
        @SerializedName("precip")
        @Expose
        private Double precip;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("weather")
        @Expose
        private WeatherMedia weather;
        @SerializedName("sunset")
        @Expose
        private String sunset;
        @SerializedName("temp")
        @Expose
        private Double temp;
        @SerializedName("sunrise")
        @Expose
        private String sunrise;
        @SerializedName("app_temp")
        @Expose
        private Double appTemp;

        public String getWindCdir() {
                return windCdir;
        }

        public void setWindCdir(String windCdir) {
                this.windCdir = windCdir;
        }

        public Double getRh() {
                return rh;
        }

        public void setRh(Double rh) {
                this.rh = rh;
        }

        public String getPod() {
                return pod;
        }

        public void setPod(String pod) {
                this.pod = pod;
        }

        public Double getLon() {
                return lon;
        }

        public void setLon(Double lon) {
                this.lon = lon;
        }

        public Double getPres() {
                return pres;
        }

        public void setPres(Double pres) {
                this.pres = pres;
        }

        public String getTimezone() {
                return timezone;
        }

        public void setTimezone(String timezone) {
                this.timezone = timezone;
        }

        public String getObTime() {
                return obTime;
        }

        public void setObTime(String obTime) {
                this.obTime = obTime;
        }

        public String getCountryCode() {
                return countryCode;
        }

        public void setCountryCode(String countryCode) {
                this.countryCode = countryCode;
        }

        public Double getClouds() {
                return clouds;
        }

        public void setClouds(Double clouds) {
                this.clouds = clouds;
        }

        public Double getVis() {
                return vis;
        }

        public void setVis(Double vis) {
                this.vis = vis;
        }

        public Double getSolarRad() {
                return solarRad;
        }

        public void setSolarRad(Double solarRad) {
                this.solarRad = solarRad;
        }

        public String getStateCode() {
                return stateCode;
        }

        public void setStateCode(String stateCode) {
                this.stateCode = stateCode;
        }

        public Double getWindSpd() {
                return windSpd;
        }

        public void setWindSpd(Double windSpd) {
                this.windSpd = windSpd;
        }

        public Double getLat() {
                return lat;
        }

        public void setLat(Double lat) {
                this.lat = lat;
        }

        public String getWindCdirFull() {
                return windCdirFull;
        }

        public void setWindCdirFull(String windCdirFull) {
                this.windCdirFull = windCdirFull;
        }

        public Double getSlp() {
                return slp;
        }

        public void setSlp(Double slp) {
                this.slp = slp;
        }

        public String getDatetime() {
                return datetime;
        }

        public void setDatetime(String datetime) {
                this.datetime = datetime;
        }

        public Double getTs() {
                return ts;
        }

        public void setTs(Double ts) {
                this.ts = ts;
        }

        public String getStation() {
                return station;
        }

        public void setStation(String station) {
                this.station = station;
        }

        public Double getHAngle() {
                return hAngle;
        }

        public void setHAngle(Double hAngle) {
                this.hAngle = hAngle;
        }

        public Double getDewpt() {
                return dewpt;
        }

        public void setDewpt(Double dewpt) {
                this.dewpt = dewpt;
        }

        public Double getUv() {
                return uv;
        }

        public void setUv(Double uv) {
                this.uv = uv;
        }

        public Double getDni() {
                return dni;
        }

        public void setDni(Double dni) {
                this.dni = dni;
        }

        public Double getWindDir() {
                return windDir;
        }

        public void setWindDir(Double windDir) {
                this.windDir = windDir;
        }

        public Double getElevAngle() {
                return elevAngle;
        }

        public void setElevAngle(Double elevAngle) {
                this.elevAngle = elevAngle;
        }

        public Double getGhi() {
                return ghi;
        }

        public void setGhi(Double ghi) {
                this.ghi = ghi;
        }

        public Double getDhi() {
                return dhi;
        }

        public void setDhi(Double dhi) {
                this.dhi = dhi;
        }

        public Double getPrecip() {
                return precip;
        }

        public void setPrecip(Double precip) {
                this.precip = precip;
        }

        public String getCityName() {
                return cityName;
        }

        public void setCityName(String cityName) {
                this.cityName = cityName;
        }

        public WeatherMedia getWeather() {
                return weather;
        }

        public void setWeather(WeatherMedia weather) {
                this.weather = weather;
        }

        public String getSunset() {
                return sunset;
        }

        public void setSunset(String sunset) {
                this.sunset = sunset;
        }

        public Double getTemp() {
                return temp;
        }

        public void setTemp(Double temp) {
                this.temp = temp;
        }

        public String getSunrise() {
                return sunrise;
        }

        public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
        }

        public Double getAppTemp() {
                return appTemp;
        }

        public void setAppTemp(Double appTemp) {
                this.appTemp = appTemp;
        }

        @Override
        public String toString() {
                return new ToStringBuilder(this).append("windCdir", windCdir).append("rh", rh).append("pod", pod).append("lon", lon).append("pres", pres).append("timezone", timezone).append("obTime", obTime).append("countryCode", countryCode).append("clouds", clouds).append("vis", vis).append("solarRad", solarRad).append("stateCode", stateCode).append("windSpd", windSpd).append("lat", lat).append("windCdirFull", windCdirFull).append("slp", slp).append("datetime", datetime).append("ts", ts).append("station", station).append("hAngle", hAngle).append("dewpt", dewpt).append("uv", uv).append("dni", dni).append("windDir", windDir).append("elevAngle", elevAngle).append("ghi", ghi).append("dhi", dhi).append("precip", precip).append("cityName", cityName).append("weather", weather).append("sunset", sunset).append("temp", temp).append("sunrise", sunrise).append("appTemp", appTemp).toString();
        }
}