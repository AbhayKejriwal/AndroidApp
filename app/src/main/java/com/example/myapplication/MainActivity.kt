package com.example.myapplication

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun clickHandler(view: View) {
        Log.i("MainActivity-clickHandler", "button clicked")
        //val dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:12345678"))
        val webIntent: Intent = Intent(/* action = */
            ACTION_VIEW, /* uri = */
            Uri.parse("https://www.yahoo.com")
        ).apply {
            startActivity(this)
        }
    }
}