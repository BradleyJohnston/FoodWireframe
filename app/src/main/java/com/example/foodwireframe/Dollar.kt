package com.example.foodwireframe

class Dollar() {
    var dollar: Int = 0
    var cent: Int = 0

    fun sum(rhs: Dollar): Dollar {
        dollar += rhs.dollar
        cent += rhs.cent
        return this
    }
}