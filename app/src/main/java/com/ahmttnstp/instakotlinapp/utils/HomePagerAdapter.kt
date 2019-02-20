package com.ahmttnstp.instakotlinapp.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by ahmttnstp on 20.02.2019.
 */
class HomePagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm) {

    private val myFragmentList:ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment {
       return myFragmentList.get(position)
    }

    override fun getCount(): Int {
       return myFragmentList.size
    }

    //My Function
    fun addFragment(fragment: Fragment){
        myFragmentList.add(fragment)
    }
}