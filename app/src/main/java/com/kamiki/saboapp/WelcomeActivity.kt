package com.kamiki.saboapp

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.TranslateAnimation
import androidx.activity.OnBackPressedCallback
import com.kamiki.saboapp.admin.LoginActivity
import com.kamiki.saboapp.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val translationAnimation = TranslateAnimation(0f, 100f, 0f, 100f)
        translationAnimation.duration = 10000
        translationAnimation.repeatCount = ObjectAnimator.INFINITE
        translationAnimation.repeatMode = TranslateAnimation.REVERSE

        binding.ivWelcome.startAnimation(translationAnimation)

        binding.btnAdmin.setOnClickListener(this)
        binding.btnUser.setOnClickListener(this)
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                finishAffinity()
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_admin -> {
                val adminIntent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(adminIntent)
                finish()
            }
            R.id.btn_user -> {
                val userIntent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(userIntent)
                finish()
            }
        }
    }

}