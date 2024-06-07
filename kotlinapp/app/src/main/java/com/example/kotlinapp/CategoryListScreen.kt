package com.example.kotlinapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CategoryListScreen(categories: List<Category>, onCategoryClick: (Category) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(categories.size) { index ->
            CategoryItem(category = categories[index], onClick = onCategoryClick)
        }
    }
}
