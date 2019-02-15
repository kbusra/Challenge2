package com.example.challenge.model

data class Category(

    val children: List<Any>,

    val cover: Cover,

    val id: Int,

    val logo: Logo,

    val name: String,

    val order: Int,

    val parentCategory: Any,

    val parentId: Any
)