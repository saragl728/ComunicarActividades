package com.example.comunicaractividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicaractividades.databinding.ActivityPantalla2Binding

class Pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_pantalla2)

        val binding = ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}