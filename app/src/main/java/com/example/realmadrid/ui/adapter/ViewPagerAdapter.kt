package com.example.realmadrid.ui.adapter

import com.example.realmadrid.ui.fragment.SquadFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.realmadrid.ui.fragment.TopFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SquadFragment()
            1 -> TopFragment()
            else -> SquadFragment()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}