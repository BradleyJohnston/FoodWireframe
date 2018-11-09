package com.example.foodwireframe

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

// the private offscreen var will be used in animations
class MainActivity (private var offScreen: Boolean = false) : AppCompatActivity() {

    // Variable declarations
    lateinit var menu: ArrayList<String>

    /**
     * onCreate will initialize anything that we cannot already do
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("MainActivity: Start")
    }

    /**
     * This is going to be the onClick attribute for multiple buttons
     * that we are going to use to TEMPORARILY open a new intent.
     */
    fun toPurchaseActivity (view: View) {
        // Declare variables
        var combo: String = String()

        if (view == button) {
            combo = button.text.toString()
        }
        else if (view == button2) {
            combo = button2.text.toString()
        }
        else if (view == button3) {
            combo = button3.text.toString()
        }
        else if (view ==  button4) {
            combo = button4.text.toString()
        }
        else {
            print("MainActivity: What did you even do???")
            return
        }

        var intent: Intent = Intent(this, PurchaseActivity::class.java).apply {
            putExtra("SANDWICH", combo)
        }

        print("MainActivity: Starting the activity")
        startActivity(intent)
    }

    fun onCustomView(view: View) {
        var intent: Intent = Intent(this, CustomActivity::class.java)

        print("MainActivity: Starting the activity")
        startActivity(intent)
    }

    /**
     * This function will take all of the purchased items and calculate
     * the total.
     */
    fun getTotal():Dollar {
        var total: Dollar = Dollar()

        total.dollar = 0
        total.cent = 0

        // TODO Calculate the sum of the purchased items
        return total
    }
}
