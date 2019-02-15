package com.example.challenge.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge.R
import com.example.challenge.model.Product

class productViewHolder(viewGroup: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item_products, viewGroup, false)
) {

    private val txtName by lazy { itemView.findViewById<TextView>(R.id.productTitle) }
    private val txtIsPrimary by lazy { itemView.findViewById<TextView>(R.id.oldPrice) }

    fun bindTo(products: Product) {

        txtName.text = products.title
        txtIsPrimary.text = products.oldPrice.toString()

    }

}

