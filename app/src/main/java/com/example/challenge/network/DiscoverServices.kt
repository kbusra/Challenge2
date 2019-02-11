package com.example.challenge.network

import com.example.challenge.network.response.DiscoverResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DiscoverServices {

    @GET("discover")
    fun getStoriesById(): Call<DiscoverResponse>
}