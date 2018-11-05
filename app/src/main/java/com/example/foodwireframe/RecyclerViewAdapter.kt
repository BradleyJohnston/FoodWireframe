package com.example.foodwireframe

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.sandwich_layout.view.*


class RecyclerViewAdapter(val items: ArrayList<String>, val context: Context)
    : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.sandwich_layout, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.foodItem.textView.text = items.get(p1)
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    var foodItem: View = view.foodName
}


// Constrained layout, inside of there will be a image view, inside of that will be a an editext and an edit text
// Suggest the quick buy menu be combo meals.
// Do not use the recycler view, if you have to use the listview
//