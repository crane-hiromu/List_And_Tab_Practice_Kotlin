package com.example.list_and_tab_practice_kotlin.recycle

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.list_and_tab_practice_kotlin.R

class ViewRecycleHolder(val view: View) : RecyclerView.ViewHolder(view) {
    var textViewItem: TextView = view.findViewById(R.id.list_item_text)
}