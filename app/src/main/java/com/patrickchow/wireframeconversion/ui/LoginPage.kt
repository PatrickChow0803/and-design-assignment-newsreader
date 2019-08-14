package com.patrickchow.wireframeconversion.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patrickchow.wireframeconversion.R
import kotlinx.android.synthetic.main.activity_main.*

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener{
            val listPageIntent = Intent(this, ListPage::class.java)
            startActivity(listPageIntent)
        }

    }
}
