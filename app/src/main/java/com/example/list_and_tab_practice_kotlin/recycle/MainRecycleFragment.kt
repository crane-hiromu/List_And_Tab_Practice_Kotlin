package com.example.list_and_tab_practice_kotlin.recycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.list_and_tab_practice_kotlin.R

class MainRecycleFragment : Fragment() {

    // MARK: Properties

    private val data: List<String> = arrayListOf("hoge", "huga", "fizz", "buzz")
    private lateinit var recycleView: RecyclerView
    private lateinit var recycleAdapter: MainRecycleAdapter

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

        // TODO refactor
        if (this.context != null) {
            recycleAdapter = MainRecycleAdapter(
                this.context!!,
                data
            )
        }

        recycleView = view.findViewById(R.id.fragment_recycle)
        recycleView.adapter = recycleAdapter
    }
}
