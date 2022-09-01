package com.example.myfirstgitproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstgitproject.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTestBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
    }

    fun goMainActivity(view: View){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}