package com.patrickchow.wireframeconversion.ui

import android.content.Intent
import android.graphics.Picture
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.patrickchow.wireframeconversion.R
import kotlinx.android.synthetic.main.activity_list__page.*
import java.net.URI

class ListPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list__page)

        image_first.setOnClickListener{
            val firstIntent = Intent(this, Detail_Page::class.java)
            firstIntent.putExtra("key1", R.drawable.image1)
            startActivity(firstIntent)
        }

        image_second.setOnClickListener{
            val secondIntent = Intent(this, Detail_Page::class.java)
            secondIntent.putExtra("key1", R.drawable.image2)
            startActivity(secondIntent)
        }

        image_first.setOnClickListener{
            val thirdIntent = Intent(this, Detail_Page::class.java)
            thirdIntent.putExtra("key1", R.drawable.image3)
            startActivity(thirdIntent)
        }

        image_first.setOnClickListener{
            val fourthIntent = Intent(this, Detail_Page::class.java)
            fourthIntent.putExtra("key1", R.drawable.image4)
            startActivity(fourthIntent)
        }

        image_first.setOnClickListener{
            val fifthIntent = Intent(this, Detail_Page::class.java)
            fifthIntent.putExtra("key1", R.drawable.image5)
            startActivity(fifthIntent)
        }


    }
}
