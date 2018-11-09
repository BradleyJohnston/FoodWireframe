package com.example.foodwireframe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_purchase.*

class PurchaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase)

        val message = intent.getStringExtra("SANDWICH")

        textView.text = "You have purchased a \"$message\", we will now continue to payment."
    }

    fun onCloseActivity(view: View) {
        finish()
    }
}
