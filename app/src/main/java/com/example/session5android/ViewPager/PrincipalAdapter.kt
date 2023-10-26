package com.example.session5android.ViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.session5android.Models.User

class PrincipalAdapter(fragment: FragmentActivity, val user: User) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int {
        return 1
    }

    override fun createFragment(position: Int): Fragment {

        return AddOnServicesMenu(user)
    }

}

