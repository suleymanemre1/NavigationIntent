package com.suleymankorkmaz.navigationlearnapp

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.suleymankorkmaz.navigationlearnapp.databinding.ActivityMainBinding
import com.suleymankorkmaz.navigationlearnapp.databinding.ActivitySecondScreenBinding

private lateinit var binding: ActivitySecondScreenBinding

class SecondScreenActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun button2(view : View) {
        var gecis = Intent(this,MainActivity::class.java)
        startActivity(gecis)
    }
}