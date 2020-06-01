package io.github.jgingh7.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.jgingh7.coderswag.R
import io.github.jgingh7.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
