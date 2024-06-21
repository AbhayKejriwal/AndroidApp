package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name:String =  "abdul"
        Log.i(TAG,"activity is getting created")
    }

    fun clickHandler(view: View) {
        Log.i("MainActivity-clickHandler", "button clicked")
        var hIntent:Intent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("mykey","android-vit-abdul")
        startActivity(hIntent)
    }

    //chick came out of the egg --activity is visible to the user to interact - click
    override fun onStart() {
        super.onStart()
        Log.e(TAG, "activity is started")
    }

    //sleep night -- incoming call ur activity goes into the background for sometime
    override fun onPause() {
        super.onPause()
        Log.w(TAG, "activity has paused")

    }

    //death of the chick -- activity no longer exists in the ram -- pushed to hdd[hibernate]
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "activity is stopped")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "activity is destroyed")
    }

    fun inflateXml(){
        var nameEditText = EditText(this)
        nameEditText.setHint("enter ur name")
        var pwdEditText = EditText(this)
        pwdEditText.setHint("enter ur pass")
        var loginButton = Button(this)
        loginButton.setText("login")
    }
}