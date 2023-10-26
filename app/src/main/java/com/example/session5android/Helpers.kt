package com.example.session5android

import android.content.Context
import android.widget.Toast
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Helpers {
    private val BASE_URL = "http://10.0.2.2:5260/";

    fun getServices() = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
        GsonConverterFactory.create()
    ).build().create(Services::class.java)

    fun ShowToast(context: Context, content: String) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
    }


}