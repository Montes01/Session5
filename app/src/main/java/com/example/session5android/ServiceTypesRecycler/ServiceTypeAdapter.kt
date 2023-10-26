package com.example.session5android.ServiceTypesRecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.session5android.Models.ServiceType
import com.example.session5android.R

class ServiceTypeAdapter(var types:List<ServiceType>):RecyclerView.Adapter<ServiceTypeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceTypeViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        return ServiceTypeViewHolder(inflater.inflate(R.layout.service_type_item, parent, false))
    }

    override fun getItemCount(): Int = types.size

    override fun onBindViewHolder(holder: ServiceTypeViewHolder, position: Int) {
        holder.render(types[position])
    }
}