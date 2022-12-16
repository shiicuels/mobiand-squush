package com.example.mobiand_squush

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobiand_squush.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCat1.setOnClickListener{
            val intentCat1Activity = Intent(this, GameActivity::class.java)
            startActivityForResult(intentCat1Activity, REQUEST_CODE3)
        }
    }
}