package com.example.onlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.R
import com.example.onlineshop.model.Country

class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var country_image = itemView.findViewById<ImageView>(R.id.image_country)
    var country_name = itemView.findViewById<TextView>(R.id.txt_country_name)
}
class CountryAdapter(var countryList:ArrayList<Country>):RecyclerView.Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.country,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.country_image.setImageResource(countryList[position].country_image)
        holder.country_name.text=countryList[position].country_name
    }

}