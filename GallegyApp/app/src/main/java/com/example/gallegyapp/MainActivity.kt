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




        var iV0 = ImageView(this)
        var iV1  = ImageView(this)
        var iV2 = ImageView(this)
        var iV3 = ImageView(this)
        var iV4 = ImageView(this)
        var iV5 = ImageView(this)
        var iV6 = ImageView(this)
        var iV7  = ImageView(this)
        var iV8 = ImageView(this)
        var  iV9= ImageView(this)

        var imageViewList: Array<ImageView> = arrayOf(iV0, iV1, iV2, iV3, iV4, iV5, iV6, iV7, iV8, iV9)


        imageViewList[0].setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.aerial_photography_aerial_shot_aerial_view_2583847
            )
        )

        imageViewList[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))

        imageViewList[2].setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.alley_architecture_buildings_2526517
            )
        )

        imageViewList[3].setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.abstract_abstract_expressionism_art_2505693
            )
        )

        imageViewList[4].setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.architectural_design_architecture_bridge_2540653
            )
        )

        imageViewList[5].setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.beautiful_breathtaking_canada_day_2526105
            )
        )

        imageViewList[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))

        imageViewList[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))

        imageViewList[8].setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.clouds_coconut_trees_daylight_2486168
            )
        )

        imageViewList[9].setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.adventure_automobile_classic_2533092
            )
        )


        /* <style name="Drawable">

        <item name="android:padding">8dp</item>
        <item name="android:adjustViewBounds">true</item>
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">wrap_content</item>

        </style> **/

        //set up the imageView


        //TODO
        //o apply the height and width, we'll need to create a LayoutParams object
        // and pass in constants to represent match_parent and wrap_content as constructor parameters.
        //  We use LinearLayout.LayoutParams because the parent is a LinearLayout
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        var i = 0
        imageViewList.forEach {
            it.adjustViewBounds = true
            it.setPadding(8,8,8,8)
            it.layoutParams = layoutParams

            if(i++ < imageViewList.size /2){
                column_left.addView(it)
            }else{
                column_right.addView(it)
            }

        }


        //populating the list
    }
}




