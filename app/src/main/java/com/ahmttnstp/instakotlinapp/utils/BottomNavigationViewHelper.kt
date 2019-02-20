package com.ahmttnstp.instakotlinapp.utils

import android.content.Context
import android.content.Intent
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import com.ahmttnstp.instakotlinapp.Home.HomeActivity
import com.ahmttnstp.instakotlinapp.News.NewsActivity
import com.ahmttnstp.instakotlinapp.Profile.ProfileActivity
import com.ahmttnstp.instakotlinapp.R
import com.ahmttnstp.instakotlinapp.Search.SearchActivity
import com.ahmttnstp.instakotlinapp.Share.ShareActivity
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

/**
 * Created by ahmttnstp on 20.02.2019.
 */
class BottomNavigationViewHelper {

    companion object {
        fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx){

            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.enableItemShiftingMode(false)
            bottomNavigationViewEx.enableShiftingMode(false)
            bottomNavigationViewEx.setTextVisibility(false)
        }
        fun setupNavigation(context: Context,bottomNavigationViewEx: BottomNavigationViewEx)
        {
            bottomNavigationViewEx.onNavigationItemSelectedListener=object : BottomNavigationView.OnNavigationItemSelectedListener {
                override fun onNavigationItemSelected(item: MenuItem): Boolean {
                    when(item.itemId){
                        R.id.ic_home ->{
                           val intent=Intent(context,HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_search ->{
                            val intent=Intent(context,SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_share ->{
                            val intent=Intent(context,ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_news ->{
                            val intent=Intent(context,NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_profile ->{
                            val intent=Intent(context,ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                    }
                    return false
                }
            }
        }
    }
}