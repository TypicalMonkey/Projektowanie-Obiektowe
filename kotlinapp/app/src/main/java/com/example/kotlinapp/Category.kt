package com.example.kotlinapp

data class Category(
    val id: Int,
    val name: String,
    val products: List<Product>
)
