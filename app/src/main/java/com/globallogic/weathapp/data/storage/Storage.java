package com.globallogic.weathapp.data.storage;

public interface Storage {

    String FIRST_APP_USE_KEY = "first_app_use_key";

    boolean getFirstUse();

    void setFirstUse(boolean FirstUse);
}
