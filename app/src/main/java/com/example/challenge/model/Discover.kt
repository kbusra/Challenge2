package com.example.challenge.model

data class Discover(
    val categories: List<Category>,
    val collections: List<Collection>,
    val featured: List<Featured>,
    val products: List<Product>,
    val shops: List<Shop>,
    val title: String,
    val type: String = ""
)