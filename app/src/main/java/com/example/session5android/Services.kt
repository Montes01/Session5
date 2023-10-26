package com.example.session5android

import com.example.session5android.Models.LoginUser
import com.example.session5android.Models.ServiceType
import com.example.session5android.Models.Response as Res
import com.example.session5android.Models.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Services {
    @POST("User/Login")
    fun login(@Body user:LoginUser): Call<Res<User>>

    @GET("Services/Types")
    fun getServiceTypes():Call<Res<List<ServiceType>>>
}