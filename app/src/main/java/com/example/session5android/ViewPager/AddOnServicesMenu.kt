package com.example.session5android.ViewPager

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.session5android.Helpers
import com.example.session5android.Models.Response as Res
import com.example.session5android.Models.ServiceType
import com.example.session5android.Models.User
import com.example.session5android.R
import com.example.session5android.ServiceTypesRecycler.ServiceTypeAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class AddOnServicesMenu(val user: User) : Fragment() {

    var adapter = ServiceTypeAdapter(listOf())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_on_services_menu, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents()
    }

    private fun getTypes() {
        var service = Helpers.getServices()
        service.getServiceTypes().enqueue(object : Callback<Res<List<ServiceType>>> {
            override fun onResponse(
                call: Call<com.example.session5android.Models.Response<List<ServiceType>>>,
                response: Response<com.example.session5android.Models.Response<List<ServiceType>>>
            ) {
                var body = response.body()
                if (response.isSuccessful) {
                    adapter.types = body?.response!!
                    adapter.notifyDataSetChanged()
                    Log.d("axa", "onResponse: $body")
                    Toast.makeText(view?.context, "Got it", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(
                        view?.context, "Hubo un error al obtener los datos", Toast.LENGTH_SHORT
                    ).show();
                }


            }

            override fun onFailure(
                call: Call<com.example.session5android.Models.Response<List<ServiceType>>>,
                t: Throwable
            ) {
                Toast.makeText(
                    view?.context, "Hubo un error al obtener los datos", Toast.LENGTH_SHORT
                ).show();
            }

        })
    }


    private fun initComponents() {

        var serviceTypeList: RecyclerView? = view?.findViewById(R.id.ServiceTypeList);
        serviceTypeList?.adapter = adapter;
        serviceTypeList?.layoutManager = LinearLayoutManager(serviceTypeList?.context)
        getTypes()
        var welcome: TextView? = view?.findViewById(R.id.WelcomeText)
        welcome?.text = "Welcome ${user.fullName}"


    }


}