package com.example.session5android.ServiceTypesRecycler

import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.session5android.Models.ServiceType
import com.example.session5android.R
import com.squareup.picasso.Picasso

class ServiceTypeViewHolder(view: View):ViewHolder(view) {
    var TypeTitle: TextView = view.findViewById(R.id.TypeTitle)
    var ListIcon:ImageView = view.findViewById(R.id.ListIcon)
    fun render(serviceType: ServiceType) {
        TypeTitle.text = serviceType.name
        var path = ListIcon.context.resources.getIdentifier("th.jpg", "drawable", itemView.context.packageName).toString()
        Picasso.get().load(path).into(ListIcon)
    }
}