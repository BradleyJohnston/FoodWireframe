package com.example.foodwireframe

import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity (private var offScreen: Boolean = false) : AppCompatActivity() {

    // Variable declarations
    lateinit var purchasedItems: List<FoodItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        print("Main Activity: OnCreate Start")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("Main Activity: OnCreate End")
    }

    fun onMoveViews(view: View) {
        var moveAmount: Float = window.decorView.rootView.width.toFloat()
        var moveOffAnimation = ObjectAnimator.ofFloat(imageView2, "translationX", moveAmount)
        moveOffAnimation.duration = 100
        moveOffAnimation.start()
        offScreen = true
    }

    fun onReturnViews(view: View) {
        var moveAmount: Float = 0f
        var moveAnimation = ObjectAnimator.ofFloat(imageView2, "translationX", 0f)
        moveAnimation.duration = 100
        moveAnimation.start()
        offScreen = false
    }

    fun onTransition(view: View) {

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
