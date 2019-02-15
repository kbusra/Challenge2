package com.example.challenge.network

import com.example.challenge.network.response.DiscoverResponse
import retrofit2.Call
import retrofit2.http.GET

interface DiscoverServices {

    @GET("api/v2/discover/")
    fun getProduct(): Call<List<DiscoverResponse>>
}