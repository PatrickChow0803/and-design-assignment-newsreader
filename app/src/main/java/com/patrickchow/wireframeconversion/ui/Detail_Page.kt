package com.patrickchow.wireframeconversion.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.patrickchow.wireframeconversion.R

class Detail_Page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail__page)

        val bundle:Bundle?= intent.extras

        val imageSelection = bundle!!.getInt("key")


        Toast.makeText(this, imageSelection, Toast.LENGTH_SHORT).show()
    }
}
