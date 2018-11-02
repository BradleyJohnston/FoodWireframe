package com.example.foodwireframe

import android.media.Image

class FoodItem {
    // bread, cheese, otherIngredients, name, price, image
    lateinit var bread: String
    lateinit var cheese: String
    lateinit var otherItems: List<String>
    lateinit var name: String
    lateinit var price: Dollar
    lateinit var image: Image
}