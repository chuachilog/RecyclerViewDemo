package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.data.MyAdapter
import com.example.recyclerviewdemo.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Pen",2.50, R.drawable.ic_baseline_airline_seat_individual_suite_24),
            Product("Computer",3500.00, R.drawable.ic_baseline_airport_shuttle_24),
            Product("Book",35.00, R.drawable.ic_launcher_background),
            Product("Keyboard",150.00, R.drawable.ic_launcher_foreground),
            Product("Pencil",5.00,R.drawable.ic_baseline_airport_shuttle_24),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.productRecycleView)
        recyclerView.adapter = MyAdapter(productList)
        recyclerView.setHasFixedSize(true)
    }
}