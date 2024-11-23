package com.example.lab07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab07.databinding.ActivityDetailBinding
import com.example.lab07.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //retrieve data from Main Activity

        val name = intent.getStringExtra("name")
        binding.nameTextView.text = name

        val address = intent.getStringExtra("address")
        binding.addressTextView.text = address

        val city = intent.getStringExtra("city")
        binding.cityTextView.text = city

        val province = intent.getStringExtra("province")
        binding.provinceTextView.text = province

        val postal = intent.getStringExtra("postal")
        binding.postalTextView.text = postal

        val country = intent.getStringExtra("country")
        binding.countryTextView.text = country
    }
}