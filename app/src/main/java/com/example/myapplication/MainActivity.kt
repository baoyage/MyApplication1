package com.example.myapplication

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val orientation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_PORTRAIT) {
            button_toast.setOnClickListener {
                val text = "This is a Toast"
                val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER, 0, 475)
                toast.show()
            }
        }

    }
}