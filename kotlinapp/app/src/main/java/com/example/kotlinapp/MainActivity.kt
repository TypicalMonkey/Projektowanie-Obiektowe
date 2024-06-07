package com.example.kotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import com.example.kotlinapp.ui.theme.KotlinAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var selectedCategory by remember { mutableStateOf<Category?>(null) }

    val categories = generateDummyCategories()

    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        if (selectedCategory == null) {
            CategoryListScreen(categories = categories) { category ->
                selectedCategory = category
            }
        } else {
            ProductListScreen(products = selectedCategory!!.products)
        }
    }
}

private fun generateDummyCategories(): List<Category> {
    val products1 = listOf(
        Product(1, "Product 1", 10.0),
        Product(2, "Product 2", 20.0),
        Product(3, "Product 3", 30.0),
        Product(4, "Product 4", 40.0),
        Product(5, "Product 5", 50.0)
    )
    val products2 = listOf(
        Product(6, "Product 6", 60.0),
        Product(7, "Product 7", 70.0),
        Product(8, "Product 8", 80.0),
        Product(9, "Product 9", 90.0),
        Product(10, "Product 10", 100.0)
    )

    return listOf(
        Category(1, "Category 1", products1),
        Category(2, "Category 2", products2)
    )
}
