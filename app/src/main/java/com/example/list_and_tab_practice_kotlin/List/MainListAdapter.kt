package com.example.list_and_tab_practice_kotlin.List

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.list_and_tab_practice_kotlin.R


class MainListAdapter(val context: Context, val models: List<String>) : BaseAdapter() {

    // MARK: Properties

    private val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


    // MARK: Overrides

    override fun getCount(): Int {
        return models.count()
    }

    override fun getItem(position: Int): String {
        return models[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = layoutInflater.inflate(R.layout.fragment_main_list_item, parent, false)
        var label = view.findViewById<TextView>(R.id.list_item_text)
        label.text = models[position]
        return view
    }
}