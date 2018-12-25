package com.globallogic.weathapp.settings

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import butterknife.BindViews
import butterknife.ButterKnife
import butterknife.OnClick
import com.globallogic.weathapp.R
import com.google.android.gms.location.places.ui.PlacePicker
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : Activity() {

    private val PLACE_PICKER_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.iv_location)
    fun changeLocation() {
        val builder = PlacePicker.IntentBuilder()
        startActivityForResult(builder.build(this), PLACE_PICKER_REQUEST)
        //TODO update location
    }

    @OnClick(R.id.tv_lang_val,
             R.id.switch_temperature)
    fun featureUnderDevelopment() {
        Toast.makeText(this, "Feature under development", Toast.LENGTH_SHORT)
    }
}
