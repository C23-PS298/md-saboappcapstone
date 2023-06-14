package com.kamiki.saboapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import com.kamiki.saboapp.databinding.ActivityLoginBinding
import com.kamiki.saboapp.ui.home.HomeFragment

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignin.setOnClickListener(this)
        binding.btnSignup.setOnClickListener(this)
        binding.backToWelcome.setOnClickListener(this)
        val callback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                finishAffinity()
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_signin -> {
                val intent = Intent(this@LoginActivity, HomeFragment::class.java)
                startActivity(intent)
                finish()
            }
            R.id.btn_signup -> {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.back_to_welcome ->{
                val intent = Intent(this@LoginActivity, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}