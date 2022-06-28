package dev.waiguru.tafya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.waiguru.tafya.databinding.ActivityOnboardingoneBinding
import dev.waiguru.tafya.databinding.ActivityOnboardingtwoBinding


class OnboardingtwoActivity : AppCompatActivity() {
    lateinit var binding: ActivityOnboardingtwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnboardingtwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()

    }
    fun  castViews(){
        binding.btnNexttwo.setOnClickListener {
            val intent=Intent(this, OnboardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}