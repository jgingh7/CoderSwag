package io.github.jgingh7.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import io.github.jgingh7.coderswag.R
import io.github.jgingh7.coderswag.adaptors.ProductsAdapter
import io.github.jgingh7.coderswag.services.DataService
import io.github.jgingh7.coderswag.utilities.EXTRA_CATEGORY
import io.github.jgingh7.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    private lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) { product ->
            val detailsIntent = Intent(this, ProductDetailActivity::class.java)
            detailsIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(detailsIntent)
        }
        productsRecyclerView.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsRecyclerView.layoutManager = layoutManager
    }
}
