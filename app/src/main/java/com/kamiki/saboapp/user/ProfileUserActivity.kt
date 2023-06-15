package com.kamiki.saboapp.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.kamiki.saboapp.R
import com.kamiki.saboapp.WelcomeActivity
import com.kamiki.saboapp.databinding.ActivityProfileUserBinding
import com.kamiki.saboapp.databinding.ActivityUserBinding

class ProfileUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigationBarUserCamera.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_dashboard -> {
                    // Navigasi ke tujuan Dashboard
                    startActivity(Intent(this, UserActivity::class.java))
                    true
                }

                R.id.navigation_Camera -> {
                    // Navigasi ke tujuan CameraUserActivity
                    startActivity(Intent(this, CameraUserActivity::class.java))
                    true
                }

                R.id.navigation_profile -> {
                    // Navigasi ke tujuan Profile
                    startActivity(Intent(this, ProfileUserActivity::class.java))
                    true
                }

                else -> false
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.option_menu_user, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_notifikasi -> {
                val intent = Intent(this@ProfileUserActivity, NotifikasiUserActivity::class.java)
                startActivity(intent) //menu setting
                true
            }
            R.id.menu_logout -> {
                val intent = Intent(this@ProfileUserActivity, WelcomeActivity::class.java)
                startActivity(intent) //menu logout
                true
            }
            else -> false
        }
        return super.onOptionsItemSelected(item)
    }
}