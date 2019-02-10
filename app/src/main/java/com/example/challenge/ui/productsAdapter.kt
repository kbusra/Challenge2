package com.example.challenge.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge.dto.Products

class productsAdapter(private val newsList: List<Products>) : RecyclerView.Adapter<productViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productViewHolder {
        return productViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: productViewHolder, position: Int) {
        holder.bindTo(newsList[position])
    }

}
