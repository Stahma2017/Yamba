package com.example.yamba

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_status.*

class StatusActivity : AppCompatActivity() {

    companion object {
        const val TAG = "StatusActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        buttonTweet.setOnClickListener{
            val status = editStatus.text.toString()
            Log.d(TAG, "onClicked with status: $status")
        }
    }






}
