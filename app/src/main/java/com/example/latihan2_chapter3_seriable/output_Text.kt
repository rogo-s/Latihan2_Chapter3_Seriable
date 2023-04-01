package com.example.latihan2_chapter3_seriable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan2_chapter3_seriable.databinding.ActivityMainBinding
import com.example.latihan2_chapter3_seriable.databinding.ActivityOutputTextBinding

class output_Text : AppCompatActivity() {
    private lateinit var binding: ActivityOutputTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOutputTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val getData = intent.getSerializableExtra("User") as Seriable
        val name = getData.inputname
        val email = getData.email
        val phone = getData.phone
        val address = getData.address
        val age = getData.age

        binding.textSatu.text = getData.inputname
        binding.email.text = getData.email
        binding.phone.text = getData.phone.toString()
        binding.address.text = getData.address
        binding.age.text = getData.age.toString()

        binding.buttonBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}