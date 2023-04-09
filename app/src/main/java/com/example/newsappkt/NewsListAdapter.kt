package com.example.newsappkt

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter class for main recycler view
class NewsListAdapter: RecyclerView.Adapter<NewsViewHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        
    }
}

class NewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.titleTextView)
}