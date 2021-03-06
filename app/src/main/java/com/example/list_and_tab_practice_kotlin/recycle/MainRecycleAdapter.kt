package com.example.list_and_tab_practice_kotlin.recycle

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.list_and_tab_practice_kotlin.R


class MainRecycleAdapter(
    private val context: Context,
    private val models: List<String>
) : RecyclerView.Adapter<ViewRecycleHolder>() {

    // MARK: Overrides

    override fun getItemCount(): Int {
        return models.count()
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: ViewRecycleHolder, position: Int) {
        holder.textViewItem.text = models[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewRecycleHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.fragment_main_list_item, parent, false)
        return ViewRecycleHolder(item)
    }
}
