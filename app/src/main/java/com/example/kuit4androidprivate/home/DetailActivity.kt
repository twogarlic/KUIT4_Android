package com.example.kuit4androidprivate.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kuit4androidprivate.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivDetailBack.setOnClickListener {
            onBackPressed()
        }
    }
}
