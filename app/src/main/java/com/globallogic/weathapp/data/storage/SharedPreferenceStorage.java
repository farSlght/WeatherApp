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
}
