package com.example.galleryapp

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   //lateinit var views: Array<ImageView>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val views=Array(10){ ImageView(this)}

        views[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))
        views[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))
        views[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        views[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        views[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        views[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        views[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        views[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        views[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))
        views[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

        views[0].contentDescription=getString(R.string.adventure_automobile)
        views[1].contentDescription=getString(R.string.aerial_photography)
        views[2].contentDescription=getString(R.string.buildings)
        views[3].contentDescription=getString(R.string.bridge)
        views[4].contentDescription=getString(R.string.beautiful)
        views[5].contentDescription=getString(R.string.flora)
        views[6].contentDescription=getString(R.string.colors)
        views[7].contentDescription=getString(R.string.coconut)
        views[8].contentDescription=getString(R.string.houses)
        views[0].contentDescription=getString(R.string.astronomy)

        /*<style name="imageStyle">
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:adjustViewBounds">true</item>
        <item name="android:padding">10dp</item>
    </style>*/
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        views.forEach {
            it.layoutParams=layoutParams
            it.adjustViewBounds=true
            it.setPadding(10)
        }
        for (i in 0..5)  left_column.addView(views[i])
        for (i in 6..9)  right_column.addView(views[i])





    }
}
