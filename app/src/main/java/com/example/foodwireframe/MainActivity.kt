package com.example.foodwireframe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity (private var offScreen: Boolean = false) : AppCompatActivity() {

    // Variable declarations
    lateinit var purchasedItems: ArrayList<FoodItem>
    lateinit var menu: ArrayList<String>

  //  var menuItems: RecyclerView = rvMenu

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Main Activity:", "Begin")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("Main Activity: Recycler view stuff")
        menu = ArrayList<String>()
        getMenu()

        //menuItems.adapter = RecyclerViewAdapter(menu, applicationContext)
        print("Main Activity: OnCreate End")
    }

    fun getMenu() {
        menu.add("Hawaiian")
        menu.add("Cowboy")
        menu.add("Oriental")
    }

    fun getTotal():Dollar {
        var total: Dollar = Dollar()

        total.dollar = 0
        total.cent = 0

        // Calculate the sum of the purchased items
        for (item in purchasedItems) {
            total.sum(item.price)
        }

        return total
    }
}
