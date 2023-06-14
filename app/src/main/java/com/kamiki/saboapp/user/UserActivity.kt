package com.kamiki.saboapp.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kamiki.saboapp.R
import com.kamiki.saboapp.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}