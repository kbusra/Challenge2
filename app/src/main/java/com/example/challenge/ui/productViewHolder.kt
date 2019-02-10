package com.example.challenge.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge.R
import com.example.challenge.dto.Products

class productViewHolder(viewGroup: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context)
        .inflate(R.layout.list_item_products, viewGroup, false)
) {

    fun bindTo(products: Products) {

    }

}