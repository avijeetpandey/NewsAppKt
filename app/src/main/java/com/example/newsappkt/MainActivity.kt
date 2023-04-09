package com.example.newsappkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsappkt.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), NewsItemClicked {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        // setting up recycler view
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter: NewsListAdapter = NewsListAdapter(items = fetchData(),this)

        binding.recyclerView.adapter = adapter

        setContentView(view)
    }

    private fun fetchData() : ArrayList<String> {
        val list = ArrayList<String>()
        for (i in 0 until 100) {
            list.add("Item $i")
        }

        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this,"clicked item is $item", Toast.LENGTH_LONG).show()
    }
}