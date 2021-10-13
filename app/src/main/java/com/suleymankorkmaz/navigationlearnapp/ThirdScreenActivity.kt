package com.suleymankorkmaz.navigationlearnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.suleymankorkmaz.navigationlearnapp.databinding.ActivitySecondScreenBinding
import com.suleymankorkmaz.navigationlearnapp.databinding.ActivityThirdScreenBinding

private lateinit var binding: ActivityThirdScreenBinding

class ThirdScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun button3(view : View) {

        var gecis = Intent(this,MainActivity::class.java)
        startActivity(gecis)
    }
}