package com.example.galleryapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.example.galleryapp.R.drawable.aerial_photography_aerial_shot_aerial_view_2583847
import kotlinx.android.synthetic.main.activity_main.*
import com.example.galleryapp.R.drawable.close_up_colorful_colors_2529148 as close_up_colorful_colors_25291481

class MainActivity : AppCompatActivity() {
    var myImageArray = mutableListOf<ImageView>()
    val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImageArray.add(0, ImageView(this))
        myImageArray[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))

        myImageArray.add(1, ImageView(this))
        myImageArray[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))

        myImageArray.add(2, ImageView(this))
        myImageArray[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))

        myImageArray.add(3, ImageView(this))
        myImageArray[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))

        myImageArray.add(4, ImageView(this))
        myImageArray[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))

        myImageArray.add(5, ImageView(this))
        myImageArray[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))

        myImageArray.add(6, ImageView(this))
        myImageArray[6].setImageDrawable(ContextCompat.getDrawable(this, aerial_photography_aerial_shot_aerial_view_2583847 ))

        myImageArray.add(7, ImageView(this))
        myImageArray[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))

        myImageArray.add(8, ImageView(this))
        myImageArray[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))

        myImageArray.add(9, ImageView(this))
        myImageArray[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

        /* <style name="VerticalColumn" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="android:layout_width">0dp</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:layout_weight">1</item>
        <item name="android:orientation">vertical</item>


        //This has now been changed
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        </style>
        */

        myImageArray.forEachIndexed{ index, img ->
            img.layoutParams = layoutParams
            img.adjustViewBounds = true
            img.setPadding(10,10,10,10)

            if (index % 2 == 0){
                ll_left_column.addView(img)
            } else {
                ll_right_column.addView(img)
            }


        }



    }

}

