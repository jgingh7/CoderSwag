package io.github.jgingh7.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import io.github.jgingh7.coderswag.R
import io.github.jgingh7.coderswag.model.Product
import io.github.jgingh7.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.product_list_item.*


class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)

        detailProductImage?.setImageResource(resourceId)
        detailProductName?.text = product.title
        detailProductPrice?.text = product.price
    }
}
