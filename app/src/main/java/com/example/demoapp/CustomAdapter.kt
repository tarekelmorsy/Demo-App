package com.example.demoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(
    val userList: ArrayList<Model>,
    val recyclerViewInterface: RecyclerViewInterface
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    interface RecyclerViewInterface {
        //this method is on item click open next screen
        fun onItemClick(position: Int)
    }

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.itemView
        holder.itemView.setOnClickListener {
            recyclerViewInterface.onItemClick(position)
        }
        holder.bindItems(userList[position])

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: Model) {
            val textViewNameBranch = itemView.findViewById(R.id.name_branck) as TextView
            val imag = itemView.findViewById(R.id.image) as ImageView
            imag.setImageResource(model.image)
            textViewNameBranch.text = model.name
        }

    }
}