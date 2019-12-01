package com.example.list_and_tab_practice_kotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.list_and_tab_practice_kotlin.list.binding.MainListBindingFragment
import com.example.list_and_tab_practice_kotlin.list.holder.MainListHolderFragment
import com.example.list_and_tab_practice_kotlin.list.list.MainListFragment

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
        when (position) {
            0 -> {
                return MainListFragment()
            }
            1 -> {
                return MainListHolderFragment()
            }
            2 -> {
                return MainListBindingFragment()
            }
            3 -> {
                return Fragment()
            }
            else -> return null
        }
    }
}