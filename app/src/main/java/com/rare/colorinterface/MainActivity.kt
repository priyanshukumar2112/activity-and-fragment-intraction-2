package com.rare.colorinterface

import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rare.colorinterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var colorInterface: ColorInterface
    var c = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        blue()
        black()
        red()
        Clear()

    }

     fun Clear() {
        binding.btnclearall.setOnClickListener{
            colorInterface.colorChange(4)
            c = 0
            binding.tvno.setText(c.toString())
        }
    }

     fun red() {
        binding.btnred.setOnClickListener{
            colorInterface.colorChange(3)
            c = c + 1
            binding.tvno.setText(c.toString())
        }
    }

     fun black() {
        binding.btnblack.setOnClickListener{
            colorInterface.colorChange(2)
            c = c + 1
            binding.tvno.setText(c.toString())
    }
    }

    fun blue() {
        binding.btnblue.setOnClickListener{
            colorInterface.colorChange(1)
            c = c + 1
            binding.tvno.setText(c.toString())
        }
    }
}