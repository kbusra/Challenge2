package com.example.challenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.challenge.dto.Products
import com.example.challenge.ui.productsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = ArrayList<Products>()

        productList.add(
            Products(
                "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png",
                "1998",
                "Google",
                "25 TL",
                "50 TL"
            )
        )
        productList.add(
            Products(
                "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png",
                "1998",
                "Google",
                "25 TL",
                "50 TL"
            )
        )
        productList.add(
            Products(
                "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png",
                "1998",
                "Google",
                "25 TL",
                "50 TL"
            )
        )
        productList.add(
            Products(
                "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png",
                "1998",
                "Google",
                "25 TL",
                "50 TL"
            )
        )
        productList.add(
            Products(
                "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png",
                "1998",
                "Google",
                "25 TL",
                "50 TL"
            )
        )
        productList.add(
            Products(
                "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png",
                "1998",
                "Google",
                "25 TL",
                "50 TL"
            )
        )
        productList.add(
            Products(
                "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png",
                "1998",
                "Google",
                "25 TL",
                "50 TL"
            )
        )


        recyclerView_products.apply {
            this.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
            this.adapter = productsAdapter(productList)
        }
    }
}
