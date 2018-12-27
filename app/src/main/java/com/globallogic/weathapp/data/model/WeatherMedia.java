package com.globallogic.weathapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

//@RealmClass
public class WeatherMedia {


    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("description")
    @Expose
    private String description;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("icon", icon).append("code", code).append("description", description).toString();
    }
}

