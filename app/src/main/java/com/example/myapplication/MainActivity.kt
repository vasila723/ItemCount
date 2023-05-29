package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.R
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fisrtFragment = FisrtFragment()
        val secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fisrtFragment)
            commit() }
        binding.button1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .apply { replace(R.id.container,fisrtFragment).
                addToBackStack(null)
                commit() }
            binding.button2.setOnClickListener {
                supportFragmentManager.beginTransaction()
                    .apply { replace(R.id.container,secondFragment)
                        .addToBackStack(null)
                    commit()}            }
        }

    }

    }