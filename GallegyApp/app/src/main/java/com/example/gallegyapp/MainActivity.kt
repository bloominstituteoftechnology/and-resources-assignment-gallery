package com.example.gallegyapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewList = mutableListOf<ImageView>()




        imageViewList.add(0, ImageView(this))
        imageViewList[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))
        imageViewList.add(1, ImageView(this))
        imageViewList[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))
        imageViewList.add(2, ImageView(this))
        imageViewList[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        imageViewList.add(3, ImageView(this))
        imageViewList[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewList.add(4, ImageView(this))
        imageViewList[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        imageViewList.add(5, ImageView(this))
        imageViewList[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        imageViewList.add(6, ImageView(this))
        imageViewList[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        imageViewList.add(7, ImageView(this))
        imageViewList[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        imageViewList.add(8, ImageView(this))
        imageViewList[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        imageViewList.add(9, ImageView(this))
        imageViewList[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))


        /* <style name="Drawable">

        <item name="android:padding">8dp</item>
        <item name="android:adjustViewBounds">true</item>
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">wrap_content</item>

        </style> **/


        //TODO
        //o apply the height and width, we'll need to create a LayoutParams object
        // and pass in constants to represent match_parent and wrap_content as constructor parameters.
        //  We use LinearLayout.LayoutParams because the parent is a LinearLayout
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        //populating the list
        imageViewList.forEachIndexed{ index, listImageView ->
            listImageView.layoutParams = layoutParams
            listImageView.adjustViewBounds = true
            listImageView.setPadding(8,8,8,8)
            when {
                index %2 != 0 -> column_left.addView(listImageView)
                else -> column_right.addView(listImageView)
            }
        }

    }


}


