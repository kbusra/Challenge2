package com.example.challenge

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.challenge.network.DiscoverServices
import com.example.challenge.network.RetrofitClient
import com.example.challenge.network.response.DiscoverResponse
import com.example.challenge.ui.productsAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*   val productList = ArrayList<Products>()

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
   */
        recyclerView_products.apply {
            this.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            // this.adapter = productsAdapter(productList)
        }


        RetrofitClient.getClient().create(DiscoverServices::class.java).getProduct()
            .enqueue(object : Callback<List<DiscoverResponse>> {
                override fun onFailure(call: Call<List<DiscoverResponse>>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_LONG).show()
                }

                override fun onResponse(
                    call: Call<List<DiscoverResponse>>?, response: Response<List<DiscoverResponse>>?
                ) {

                    //  (recyclerView_products.adapter as productsAdapter).setNewList(response?.body()?.get(1)?.data?.get(0)?.products!!)

                    Toast.makeText(this@MainActivity, "Success", Toast.LENGTH_LONG).show()
                }

            })

    }
}
