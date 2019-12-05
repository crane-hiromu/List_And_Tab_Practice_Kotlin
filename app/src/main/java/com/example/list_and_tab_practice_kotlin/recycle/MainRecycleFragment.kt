package com.example.list_and_tab_practice_kotlin.recycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.list_and_tab_practice_kotlin.R
import androidx.recyclerview.widget.LinearLayoutManager



class MainRecycleFragment : Fragment() {

    // MARK: Properties

    private val data: List<String> = arrayListOf("hoge", "huga", "fizz", "buzz")
    private lateinit var recycleView: RecyclerView
    private lateinit var recycleAdapter: MainRecycleAdapter
    private lateinit var recycleLayout: LinearLayoutManager

    // MARK: Overrides

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_recycle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycleView = view.findViewById(R.id.fragment_recycle)

        this.context?.let {
            recycleAdapter = MainRecycleAdapter(it, data)
            recycleView.adapter = recycleAdapter

            recycleLayout = LinearLayoutManager(it)
            recycleView.layoutManager = recycleLayout
        }
    }
}
