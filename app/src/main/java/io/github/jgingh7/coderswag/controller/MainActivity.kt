package io.github.jgingh7.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.jgingh7.coderswag.R
import io.github.jgingh7.coderswag.adaptors.CategoryAdapter
import io.github.jgingh7.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
