package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(tabActivity:MainActivity2):FragmentStateAdapter(tabActivity) {
    override fun getItemCount(): Int =2

        override fun createFragment(position: Int): Fragment {
            val fisrtFragment = FisrtFragment()
            return when (position) {
                0 -> {
                    FisrtFragment()
                }

                1 -> {
                    SecondFragment()
                }

                else -> fisrtFragment
            }
        }
    }




