package com.example.list_and_tab_practice_kotlin.list.holder

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.list_and_tab_practice_kotlin.R


class MainListHolderAdapter(val context: Context, val models: List<String>) : BaseAdapter() {

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

        val (viewHolder, view) = if(convertView == null) {
            val view = layoutInflater.inflate(R.layout.fragment_main_list_item, parent, false)
            val viewHolder = ViewHolderItem()
            viewHolder.textViewItem = view.findViewById(R.id.list_item_text)
            view.tag = viewHolder

            // Pair(viewHolder, view)
            viewHolder to view
        } else {
//             Pair(convertView.tag as ViewHolderItem, convertView)
            convertView.tag as ViewHolderItem to convertView
        }

        val objectItem = models[position]
        if (objectItem != null) {
            viewHolder.textViewItem?.text = objectItem
        }
        return view
    }
}