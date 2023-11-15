package com.example.comunicaractividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicaractividades.databinding.ActivityPantalla2Binding

class Pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_pantalla2)

        val binding = ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras

        val s = extras?.getString("dato")?: "sin nombre"
        binding.textoBienvenida.text = "Bienvenido/a, $s, ¿acepta los términos?"

        //funciones de los botones

        //botón aceptar, se envían los datos a la main activity
        binding.botonAceptar.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("dato", "Se han aceptado los términos")
            //se pasa a la otra actividad
            startActivity(intent)
        }
        //botón rechazar
        binding.botonRechazar.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("dato", "Se han rechazado los términos")
            //se pasa a la otra actividad
            startActivity(intent)
        }
    }
}