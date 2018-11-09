package com.example.foodwireframe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class CustomActivity : AppCompatActivity() {

    /**
     * onCreate will initialize anything that we cannot already do
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)
    }

    fun onCloseActivity(view: View) {
        finish()
    }
}
