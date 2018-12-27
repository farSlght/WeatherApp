package com.globallogic.weathapp.data.storage;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceStorage implements Storage {

    private static final String STORAGE_NAME = "Preferences";

    private Context mContext;

    public SharedPreferenceStorage(Context context) {
        mContext = context;
    }

    private SharedPreferences.Editor getEditor() {
        return mContext.getSharedPreferences(STORAGE_NAME, Context.MODE_PRIVATE)
                .edit();
    }
    @Override
    public boolean getFirstUse() {
        return mContext.getSharedPreferences(STORAGE_NAME, Context.MODE_PRIVATE)
                .getBoolean(FIRST_APP_USE_KEY, true);
    }

    @Override
    public void setFirstUse(boolean FirstUse) {
        getEditor().putBoolean(FIRST_APP_USE_KEY, FirstUse)
                .apply();
    }

    @Override
    public String getLocationLat() {
        return mContext.getSharedPreferences(STORAGE_NAME, Context.MODE_PRIVATE)
                .getString(LOCATION_LAT, null);
    }

    @Override
    public void setLocationLat(String latitude) {
        getEditor().putString(LOCATION_LAT, latitude)
                .apply();
    }

    @Override
    public String getLocationLon() {
        return mContext.getSharedPreferences(STORAGE_NAME, Context.MODE_PRIVATE)
                .getString(LOCATION_LON, null);
    }

    @Override
    public void setLocationLon(String longitude) {
        getEditor().putString(LOCATION_LON, longitude)
                .apply();
    }
}
