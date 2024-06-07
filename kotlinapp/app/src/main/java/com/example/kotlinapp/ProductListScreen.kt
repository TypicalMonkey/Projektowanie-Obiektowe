package com.example.kotlinapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProductListScreen(products: List<Product>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(products.size) { index ->
            ProductItem(product = products[index])
        }
    }
}

