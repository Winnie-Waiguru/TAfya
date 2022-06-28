package dev.waiguru.tafya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.waiguru.tafya.databinding.ActivityOnboardingoneBinding

class OnboardingoneActivity : AppCompatActivity() {
    lateinit var binding: ActivityOnboardingoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnboardingoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
    }

    fun castViews(){
        binding.btnNext.setOnClickListener {
            val intent=Intent(this, OnboardingtwoActivity::class.java)
            startActivity(intent)
        }
    }

}