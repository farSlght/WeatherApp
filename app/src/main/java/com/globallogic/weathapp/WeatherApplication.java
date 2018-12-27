package com.globallogic.weathapp;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.util.Log;
import com.globallogic.weathapp.data.storage.SharedPreferenceStorage;
import com.globallogic.weathapp.data.storage.Storage;
import io.realm.Realm;
import io.realm.RealmConfiguration;

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
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(realmConfig);
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

    public static boolean isLocationAvailable() {
        return ((getLocationLatitude() != null & getLocationLongitude() != null) ||
                (!getLocationLongitude().isEmpty() & !getLocationLongitude().isEmpty())) ? true : false;
    }

    public static String getLocationLatitude() {
        return mSharedPreferencesStorage.getLocationLat();
    }

    public static void setLocationLatitude(String latitude) {
        mSharedPreferencesStorage.setLocationLat(latitude);
    }

    public static String getLocationLongitude() {
        return mSharedPreferencesStorage.getLocationLon();
    }

    public static void setLocationLongitude(String longitude) {
        mSharedPreferencesStorage.setLocationLon(longitude);
    }
}
