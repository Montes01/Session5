package com.example.session5android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.session5android.Models.User
import com.example.session5android.ViewPager.PrincipalAdapter

class PrincipalViewPager : AppCompatActivity() {
    lateinit var ServicesPager:ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_view_pager)
        val user = intent.getSerializableExtra("User") as? User
        if (user != null) {
            initComponents(user)
        } else {
            initComponents(User(0, 1, "Not Found", true, "xxx", 5))
            Log.d("User is this", "onCreate: $user")
            Toast.makeText(this, "IsHere", Toast.LENGTH_SHORT).show()
        }

    }

    private fun initComponents(user:User){
        var adapter = PrincipalAdapter(this, user)
        ServicesPager = findViewById(R.id.ServicesPager)
        ServicesPager.adapter = adapter

    }
}