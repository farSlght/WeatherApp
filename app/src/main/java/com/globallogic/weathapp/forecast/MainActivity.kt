package com.globallogic.weathapp.forecast

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.globallogic.weathapp.R
import android.widget.Toast
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.globallogic.weathapp.WeatherApplication
import com.globallogic.weathapp.api.WeatherbitApi
import com.globallogic.weathapp.database.WeatherStorage
import com.globallogic.weathapp.forecast.utils.WeatherAdapter
import com.google.android.gms.location.places.ui.PlacePicker


class MainActivity : Activity() {

    private val TAG = this::class.java.getSimpleName()
    private val PLACE_PICKER_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")

        setContentView(R.layout.activity_main)

        if (WeatherApplication.isFirstUse()) {
            val builder = PlacePicker.IntentBuilder()
            startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST)
        }

        if (WeatherApplication.isLocationAvailable()) {
            WeatherStorage(this).getCurrentWeather()
//            WeatherbitApi.getCurrentWeather()
        }

        val weatherRecycler = findViewById<RecyclerView>(R.id.weather_recycler)
        weatherRecycler.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val weatherAdapter = WeatherAdapter()
        weatherRecycler.adapter = weatherAdapter
    }

    override fun onStart() {
        super.onStart()
        // TODO: check permissions
    }

    override fun onStop() {
        super.onStop()
        WeatherApplication.setFirstUse(false)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PLACE_PICKER_REQUEST) {
            if (resultCode == RESULT_OK) {

                val place = PlacePicker.getPlace(data, this)
                val placeLat: String = place.latLng.latitude.toString()
                val placeLon: String = place.latLng.longitude.toString()
                WeatherApplication.setLocationLatitude(placeLat)
                WeatherApplication.setLocationLongitude(placeLon)

                val toastMsg = String.format("Place: %s", place.getName())
                Toast.makeText(this, toastMsg, Toast.LENGTH_LONG).show()

                WeatherbitApi.getCurrentWeather()

            }
        }
    }

}
