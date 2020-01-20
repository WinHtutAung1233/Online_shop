package com.example.onlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.R
import com.example.onlineshop.model.Latest


class LatestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var image=itemView.findViewById<ImageView>(R.id.image_arrival)
    var name=itemView.findViewById<TextView>(R.id.arrival_name)
    var type=itemView.findViewById<TextView>(R.id.arrival_type)
    var model=itemView.findViewById<TextView>(R.id.arrival_model)
    var price=itemView.findViewById<TextView>(R.id.price)
}
class LatestAdapter(var latestList:ArrayList<Latest>):RecyclerView.Adapter<LatestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.latest_arrival,parent,false)
        return LatestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestList.size
    }

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.image.setImageResource(latestList[position].image)
        holder.name.text=latestList[position].name
        holder.type.text=latestList[position].type
        holder.model.text=latestList[position].model
        holder.price.text=latestList[position].price.toString()

    }

}