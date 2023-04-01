package com.example.latihan2_chapter3_seriable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.example.latihan2_chapter3_seriable.databinding.ActivityOutputText2Binding

class Output_text2 : AppCompatActivity() {
    private lateinit var binding: ActivityOutputText2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOutputText2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val getData2 = intent.getParcelableExtra<Parcelizable>("User2") as Parcelizable
        val name2 = getData2.name
        val email2 = getData2.email
        val phone2 = getData2.phone
        val address2 = getData2.address
        val age2 = getData2.age

        binding.textSatu.text = getData2.name
        binding.email.text = getData2.email
        binding.phone.text = getData2.phone.toString()
        binding.address.text = getData2.address
        binding.age.text = getData2.age.toString()
        binding.buttonBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}