package com.example.onlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.Nullable
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.adapter.CountryAdapter
import com.example.onlineshop.adapter.LatestAdapter
import com.example.onlineshop.adapter.ProductAdapter
import com.example.onlineshop.model.Country
import com.example.onlineshop.model.Latest
import com.example.onlineshop.model.Product

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        latestarrivalView()
        countryView()
        productView()

    }

    fun latestarrivalView() {
        var recyclerTrending: RecyclerView = findViewById(R.id.recycler_latest_arrival)

        var latestList = ArrayList<Latest>()
        latestList.add(
            Latest(
                R.drawable.girlwallet,
                "Hyde Park",
                "N41015",
                "Louis Vuitton",
                1000000
            )
        )
        latestList.add(Latest(R.drawable.clothes, "Pink Lond", "Shirt", "Lady gaga", 720000))
        latestList.add(Latest(R.drawable.clothes1, "Dress", "Black", "gaga", 850000))
        var latestAdapter = LatestAdapter(latestList)

        recyclerTrending.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = latestAdapter
        }
    }

    fun countryView() {
        var recyclerCountry: RecyclerView = findViewById(R.id.recycler_country)

        var countryList = ArrayList<Country>()
        countryList.add(Country(R.drawable.japan, "Japan"))
        countryList.add(Country(R.drawable.korea, "Korea"))
        countryList.add(Country(R.drawable.china, "china"))
        countryList.add(Country(R.drawable.international, "International"))
        var countryAdapter = CountryAdapter(countryList)

        recyclerCountry.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = countryAdapter
        }
    }

    fun productView() {
        var recyclerProduct: RecyclerView = findViewById(R.id.recycler_popular)
        var productList = ArrayList<Product>()
        productList.add(
            Product(
                "New",
                "30% off",
                "IphoneX",
                "Apple",
                980000,
                "1150000Ks",
                R.drawable.iphone
            )
        )
        productList.add(
            Product(
                "New",
                "34% off",
                "Soft Bed",
                "Bed",
                3500000,
                "1360000Ks",
                R.drawable.bed
            )
        )
        productList.add(
            Product(
                "",
                "",
                "Nintendo Switch",
                "Nintendo",
                359000,
                "",
                R.drawable.nintendoswitch
            )
        )
        productList.add(Product("New", "", "Women Dress", "USA", 18990, "", R.drawable.gril_dress))
        var productAdapter = ProductAdapter(productList)

        recyclerProduct.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = productAdapter
        }
    }
}
