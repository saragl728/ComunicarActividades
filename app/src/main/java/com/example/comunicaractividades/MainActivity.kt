package com.example.comunicaractividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicaractividades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //evento de hacer click sobre acceder
        binding.botonAcceder.setOnClickListener {
            var nombre = binding.nombre.text.toString()
            //se crea el intent para comunicar con Pantalla2
            var intent = Intent(this, Pantalla2::class.java)
            intent.putExtra("dato", nombre)

            //se accede a la otra pantalla
            startActivity(intent)
        }

        //se recoge la información enviada de pantalla2
        val extras = intent.extras
        val s = extras?.getString("dato")?: "Error"

        binding.info.text = s
    }
}