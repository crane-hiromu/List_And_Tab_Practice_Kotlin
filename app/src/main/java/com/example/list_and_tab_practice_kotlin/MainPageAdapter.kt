package com.example.list_and_tab_practice_kotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    private val items: Array<CharSequence> = arrayOf("list", "list+holder", "list+binding", "recycle")


    // MARK: Override

    override fun getPageTitle(position: Int): CharSequence? {
        return items[position]
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Fragment? {
//        when (position) {
//            0 -> {
//                return MainPageListFragment()
//            }
//            1 -> {
//                return MainPageListFragment()
//            }
//            2 -> {
//                return MainPageListFragment()
//            }
//            3 -> {
//                return MainPageListFragment()
//            }
//            else -> return null
//        }

        return Fragment()

        return null
    }
}