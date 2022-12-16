package com.example.mobiand_squush

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobiand_squush.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAbout.setOnClickListener{
            val intentAboutActivity = Intent(this, AboutActivity::class.java)
            startActivityForResult(intentAboutActivity, REQUEST_CODE)
        }

        binding.btnStart.setOnClickListener{
            val intentCategoryActivity = Intent(this, CategoryActivity::class.java)
            startActivityForResult(intentCategoryActivity, REQUEST_CODE2)
        }
    }
}