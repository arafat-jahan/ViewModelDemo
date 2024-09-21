package com.example.viewmodeldemo

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val counterViewModel: CounterViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        counterViewModel.count.observe(this) { count ->
            binding.textView.text = count.toString()
        }


        binding.buttonCount.setOnClickListener {
            counterViewModel.increment()
        }
    }
}
