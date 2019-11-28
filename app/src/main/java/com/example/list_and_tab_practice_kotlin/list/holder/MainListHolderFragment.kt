package com.example.list_and_tab_practice_kotlin.list.holder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.list_and_tab_practice_kotlin.R
import com.example.list_and_tab_practice_kotlin.list.list.MainListAdapter

class MainListHolderFragment : Fragment() {

    // MARK: Properties

    private val data: List<String> = arrayListOf("hoge", "huga", "fizz", "buzz")
    private lateinit var listView: ListView
    private lateinit var listAdapter: MainListHolderAdapter

    // MARK: Overrides

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_main_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO refactor
        if (this.context != null) {
            listAdapter = MainListHolderAdapter(
                this.context!!,
                data
            )
        }

        listView = view.findViewById(R.id.fragment_list)
        listView.adapter = listAdapter
    }
}
