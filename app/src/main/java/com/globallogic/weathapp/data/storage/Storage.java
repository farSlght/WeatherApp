package com.globallogic.weathapp.data.storage;

public interface Storage {

    String FIRST_APP_USE_KEY = "first_app_use_key";
    String LOCATION_LAT = "location_lattitude";
    String LOCATION_LON = "location_longitude";

    boolean getFirstUse();

    void setFirstUse(boolean FirstUse);

    String getLocationLat();

    void setLocationLat(String lattitude);

    String getLocationLon();

    void setLocationLon(String longitude);
}
