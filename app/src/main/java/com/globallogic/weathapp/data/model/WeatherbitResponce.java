package com.globallogic.weathapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.RealmClass;


@RealmClass
public class WeatherbitResponce extends RealmObject {


    @SerializedName("data")
    @Expose
    private RealmList<WeatherData> data = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public RealmList<WeatherData> getData() {
        return data;
    }

    public void setData(RealmList<WeatherData> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).append("count", count).toString();
    }

}

