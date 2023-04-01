package com.example.latihan2_chapter3_seriable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.latihan2_chapter3_seriable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val name = binding.masuk1.text.toString()
            val email = binding.masuk2.text.toString()
            val phone = binding.masuk3.text.toString()
            val address = binding.masuk4.text.toString()
            val age = binding.masuk5.text.toString()
            val user = Seriable(name, email, phone, address, age)
            val secondActivity = Intent(this, output_Text::class.java)
            secondActivity.putExtra("User", user)
            startActivity(secondActivity)

        }
        binding.btn2.setOnClickListener {
            val name = binding.masuk1.text.toString()
            val email = binding.masuk2.text.toString()
            val phone = binding.masuk3.text.toString()
            val address = binding.masuk4.text.toString()
            val age = binding.masuk5.text.toString()
            val User2 = Parcelizable(name, email, phone, address, age)
            val secondActivity2 = Intent(this,Output_text2::class.java)
            secondActivity2.putExtra("User2",User2)
            startActivity(secondActivity2)
        }
    }
}