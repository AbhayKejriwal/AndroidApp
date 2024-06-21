package com.example.myapplication

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickHandler", "button clicked")
        //val dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:12345678"))
//        val webIntent: Intent = Intent(/* action = */
//            ACTION_VIEW, /* uri = */
//            Uri.parse("https://www.yahoo.com")
//        ).apply {
//            startActivity(this)
//        }
        var hIntent:Intent = Intent(this,HomeActivity::class.java)
        startActivity(hIntent)
    }

//    //chick came out of the egg --activity is visible to the user to interact - click
//    override fun onStart() {
//        super.onStart()
//        Log.e(TAG, "activity is started")
//    }
//
//    //sleep night -- incoming call ur activity goes into the background for sometime
//    override fun onPause() {
//        super.onPause()
//        Log.w(TAG, "activity has paused")
//
//    }
//
//    //death of the chick -- activity no longer exists in the ram -- pushed to hdd[hibernate]
//    override fun onStop() {
//        super.onStop()
//        Log.d(TAG, "activity is stopped")
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.v(TAG, "activity is destroyed")
//    }
}