package com.example.challenge.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge.model.Product

class productsAdapter(private var newsList: List<Product>) : RecyclerView.Adapter<productViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productViewHolder {
        return productViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: productViewHolder, position: Int) {
        holder.bindTo(newsList[position])
    }

    fun setNewList(newsList: List<Product>) {

        this.newsList = newsList
        notifyDataSetChanged()
    }

}
