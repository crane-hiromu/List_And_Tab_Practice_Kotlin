package com.example.list_and_tab_practice_kotlin.list.binding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import com.example.list_and_tab_practice_kotlin.R
import com.example.list_and_tab_practice_kotlin.databinding.LayoutMainListBindingItemBinding

class MainListBindingAdapter(val context: Context, val models: List<String>) : BaseAdapter() {

    // MARK: Properties

    private val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private lateinit var binding: LayoutMainListBindingItemBinding

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
        val title: String = models[position]
        val model = MainListViewModel(title)

        binding = DataBindingUtil.inflate(layoutInflater,  R.layout.layout_main_list_binding_item,  parent, false)
        binding.mainListViewModel = model

        return binding.root
    }
}