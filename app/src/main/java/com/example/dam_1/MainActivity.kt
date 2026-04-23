package com.example.dam_1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button: Button = findViewById<Button>(R.id.miBoton)

        button.setOnClickListener{
            Toast.makeText(this,"Has presionado el botón",Toast.LENGTH_SHORT).show()
        }
    }
}