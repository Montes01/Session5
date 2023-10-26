package com.example.session5android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.session5android.Models.LoginUser
import com.example.session5android.Models.Response
import com.example.session5android.Models.User
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {
    lateinit var LoginButton: Button
    lateinit var UserNameInput: EditText
    lateinit var UserPasswordInput: EditText
    lateinit var addOnServices:Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitComponents()
    }

    private fun InitComponents() {
        LoginButton = findViewById(R.id.LoginButton)
        UserNameInput = findViewById(R.id.UserNameInput)
        UserPasswordInput = findViewById(R.id.UserPasswordInput)
        LoginButton.setOnClickListener{
            login(LoginUser("${UserNameInput.text}", "${UserPasswordInput.text}"))
        }
        addOnServices = Intent(this, PrincipalViewPager::class.java)

    }

    private fun login(user: LoginUser) {
        Log.d("Usuarios", "${user}")
        Helpers.getServices().login(user).enqueue(object : Callback<Response<User>> {
            override fun onResponse(
                call: Call<Response<User>>,
                response: retrofit2.Response<Response<User>>
            ) {
                val body = response.body()?.response
                if(response.isSuccessful){
                    if (body != null) {
                        addOnServices.putExtra("User", body)
                    }
                    startActivity(addOnServices)
                    Helpers.ShowToast(LoginButton.context, "Bienvenido $body")
                } else {
                    Helpers.ShowToast(LoginButton.context, "El usuario no se encontro $body")
                }
            }

            override fun onFailure(call: Call<Response<User>>, t: Throwable) {
                Log.d("Hubo un error em la request", "${t.message}")
            }

        })


    }


}