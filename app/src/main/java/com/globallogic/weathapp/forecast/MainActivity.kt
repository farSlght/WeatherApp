package com.globallogic.weathapp.forecast

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.globallogic.weathapp.R
import com.globallogic.weathapp.WeatherApplication
import com.globallogic.weathapp.data.model.WeatherData
import com.globallogic.weathapp.data.model.WeatherViewModel
import com.google.android.gms.location.places.ui.PlacePicker
import io.realm.RealmList
import kotlinx.android.synthetic.main.view_weather_item.*


class MainActivity : AppCompatActivity() {

    private val TAG = this::class.java.getSimpleName()
    private val PLACE_PICKER_REQUEST = 1
    private lateinit var model: WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")

        setContentView(R.layout.activity_main)

        model = ViewModelProviders.of(this).get(WeatherViewModel::class.java)
        model.currentWeather.observe(this, Observer<RealmList<WeatherData>> { updates ->
            temperature.text = updates!![0]?.temp.toString()+R.string.celsius
        })

        if (WeatherApplication.isFirstUse()) {  /// pick a location
            val builder = PlacePicker.IntentBuilder()
            startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST)
        }
    }

    override fun onStart() {
        super.onStart()
        // TODO: check permissions
        if (! WeatherApplication.isFirstUse())  model.updateWeather()
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

                model.updateWeather()

            }
        }
    }

}
