package com.example.emojidictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emojidictionary.databinding.ActivityMainBinding
import com.example.emojidictionary.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    //had to add this line to make the recycler view work.
    private lateinit var binding: ActivityMainBinding
    lateinit var layoutManager : LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        binding.cyclerView.layoutManager = layoutManager
        //binding.cyclerView.adapter =





    }
}