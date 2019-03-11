package com.globallogic.weathapp.database

import android.content.Context
import android.util.Log
import com.globallogic.weathapp.data.model.WeatherbitResponce
import com.vicpin.krealmextensions.queryFirst
import io.realm.Realm

class WeatherStorage(private val context: Context) {

    init {
        Realm.init(context)
    }

    var realm: Realm? = null

    fun updateCurrentWeather(){

        try {

            realm = Realm.getDefaultInstance()
            val savedData: WeatherbitResponce? = WeatherbitResponce().queryFirst()
            savedData?.let {

                /*Update User Interface with realm cached data*/
                Log.d("STORED", it.toString())

            } ?: run {

                /// TODO: put to LiveData

        }

    } catch (e: Throwable) {

        /*Do not leave realm transactions open*/
        if (realm != null && realm!!.isInTransaction) {
            realm!!.cancelTransaction()
        }
        //Stack trace
        print("REALM ERROR: " + e.stackTrace)

    } finally {
        /*Do not leave realm transactions open*/
        realm?.close()
    }
    }
}