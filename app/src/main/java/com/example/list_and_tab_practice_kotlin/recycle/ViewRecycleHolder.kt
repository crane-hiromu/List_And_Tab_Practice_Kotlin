package com.example.list_and_tab_practice_kotlin.recycle

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewRecycleHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
    var textViewItem: TextView? = null
}