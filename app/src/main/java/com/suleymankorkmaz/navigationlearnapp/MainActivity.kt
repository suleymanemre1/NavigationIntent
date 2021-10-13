package com.suleymankorkmaz.navigationlearnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.suleymankorkmaz.navigationlearnapp.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun button1(view : View) {
        var gecis = Intent(this,SecondScreenActivity::class.java)
        startActivity(gecis)
    }
}
