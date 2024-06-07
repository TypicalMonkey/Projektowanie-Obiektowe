package com.example.kotlinapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CategoryItem(category: Category, onClick: (Category) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick(category) }
            .padding(16.dp)
    ) {
        Text(text = category.name, style = MaterialTheme.typography.titleLarge)
    }
}
