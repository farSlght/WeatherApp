package com.globallogic.weathapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.List;


//@RealmClass
public class WeatherbitResponce /*: RealmObject()*/  {


    @SerializedName("data")
    @Expose
    private List<WeatherData> data = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public List<WeatherData> getData() {
        return data;
    }

    public void setData(List<WeatherData> data) {
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

