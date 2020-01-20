package com.example.onlineshop.model


data class Product(
    var product_type_txt:String,
    var discount:String,
    var product_name:String,
    var product_type:String,
    var product_price: Int,
    var original_price:String,
    var product_image: Int
)