package com.ahmttnstp.instakotlinapp.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ahmttnstp.instakotlinapp.R
import com.ahmttnstp.instakotlinapp.utils.BottomNavigationViewHelper
import com.ahmttnstp.instakotlinapp.utils.HomePagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 0
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupNavigationView()
        setupHomeViewPager()
    }

    fun setupNavigationView(){

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        var menu = bottomNavigationView.menu
        var menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }

    fun setupHomeViewPager(){
        var homePagerAdapter = HomePagerAdapter(supportFragmentManager)
        homePagerAdapter.addFragment(CameraFragment()) //id=0
        homePagerAdapter.addFragment(HomeFragment()) //id=1
        homePagerAdapter.addFragment(MessagesFragment()) //id=2

        //activity main de bulunan viewpager a oluşturduğumuz adaptörü atadık.
        homeViewPager.adapter = homePagerAdapter

        //viewparer ın homefragmenti ile başlamasını sağladık..
        homeViewPager.setCurrentItem(1)
    }
}
