package com.example.onlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.R
import com.example.onlineshop.model.Product

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var product_type_txt = itemView.findViewById<TextView>(R.id.product_type_txt)
    var discount = itemView.findViewById<TextView>(R.id.discount)
    var product_name = itemView.findViewById<TextView>(R.id.product_name)
    var product_type = itemView.findViewById<TextView>(R.id.product_type)
    var product_price = itemView.findViewById<TextView>(R.id.product_price)
    var original_price = itemView.findViewById<TextView>(R.id.original_price)
    var product_image = itemView.findViewById<ImageView>(R.id.product_image)
}

class ProductAdapter(var productList:ArrayList<Product>):RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.popular_product,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.product_type_txt.text=productList[position].product_type_txt
        holder.discount.text=productList[position].discount
        holder.product_name.text=productList[position].product_name
        holder.product_type.text=productList[position].product_type
        holder.product_price.text=productList[position].product_price.toString()
        holder.original_price.text=productList[position].original_price
        holder.product_image.setImageResource(productList[position].product_image)

    }

}