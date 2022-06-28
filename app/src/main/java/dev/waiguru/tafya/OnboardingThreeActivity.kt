package dev.waiguru.tafya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.waiguru.tafya.databinding.ActivityOnboardingThreeBinding

class OnboardingThreeActivity : AppCompatActivity() {
    lateinit var binding: ActivityOnboardingThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnboardingThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()

    }
    fun castViews(){
        binding.btnNextThree.setOnClickListener {
            val intent=Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}