package com.example.foodwireframe

import android.content.Context
import com.example.foodwireframe.R.id.parent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.sandwich_layout.view.*


/*
package com.example.foodwireframe

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodwireframe.R.id.parent

class AdapterView(val items: ArrayList<String>, val context: Context)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return
        RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.sandwich_layout,
                parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val foodItem = view
}
 */

class RecyclerViewAdapter(val items: ArrayList<String>, val context: Context)
    : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.sandwich_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.foodItem = items.get(p1)
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val foodItem = view.foodName
}