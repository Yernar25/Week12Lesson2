package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivitymainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivitymainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitymainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = "Hi!"
        binding.textView.setOnClickListener{
            Toast.makeText(this, "Text clicked", Toast.LENGTH_SHORT).show()
        }
    }
}