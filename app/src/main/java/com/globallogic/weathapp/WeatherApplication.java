package com.globallogic.weathapp;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.util.Log;

import com.globallogic.weathapp.data.storage.SharedPreferenceStorage;
import com.globallogic.weathapp.data.storage.Storage;

public class WeatherApplication extends Application {

    private static final String TAG = WeatherApplication.class.getSimpleName();

    private static WeatherApplication sInstance;
    private static Storage mSharedPreferencesStorage;


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");

        sInstance = this;
        mSharedPreferencesStorage = new SharedPreferenceStorage(this);

        if (isFirstInstall()) {
            initDatabase();

        }
    }


    private void initDatabase() {
        /// TODO:
    }


    public static boolean isFirstInstall() {
        PackageInfo packageInfo;

        try {
            packageInfo = sInstance.getPackageManager().getPackageInfo(sInstance.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }

        return packageInfo.firstInstallTime == packageInfo.lastUpdateTime;
    }

    public static boolean isFirstUse() {
        return mSharedPreferencesStorage.getFirstUse();
    }

    public static void setFirstUse(boolean firstUse) {
        mSharedPreferencesStorage.setFirstUse(firstUse);
    }

    public static boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) sInstance.getSystemService(
                Context.CONNECTIVITY_SERVICE
        );
        return cm != null && cm.getActiveNetworkInfo() != null;
    }

    public static WeatherApplication getInstance() {
        return sInstance;
    }
}
