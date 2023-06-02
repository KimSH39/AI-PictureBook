package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onBackPressed() {
        //super.onBackPressed() 백프레스 안되게 막음
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.settingBtn.setOnClickListener {
            val intent: Intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        binding.readBookListBtn.setOnClickListener {
            val intent: Intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}