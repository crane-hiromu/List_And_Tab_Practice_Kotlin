package com.example.list_and_tab_practice_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.list_and_tab_practice_kotlin.network.DroidCliant
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainPageAdapter(supportFragmentManager)
        viewPager = findViewById(R.id.main_view_page)
        viewPager.adapter = adapter
//        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout = findViewById(R.id.main_tab_layout)
        tabLayout.setupWithViewPager(viewPager)

        // DroidCliant().call()
    }
}

