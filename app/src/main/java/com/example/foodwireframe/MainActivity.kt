package com.example.foodwireframe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Variable declarations
    //lateinit var purchasedItems: List<FoodItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        print("Main Activity: OnCreate Start")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("Main Activity: OnCreate End")
    }

    fun onClick(view: View) {
        Toast.makeText(applicationContext, "Button clicked", Toast.LENGTH_LONG).show()
    }
/*
    fun getTotal():Dollar {
        var total: Dollar = Dollar()

        total.dollar = 0
        total.cent = 0

        // Calculate the sum of the purchased items
        for (item in purchasedItems) {
            total.sum(item.price)
        }

        return total
    } */
}
