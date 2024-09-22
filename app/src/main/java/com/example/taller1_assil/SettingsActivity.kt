package com.example.taller1_assil

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)  // Asegúrate de que esté correctamente referenciado

        // Obtén las referencias a los botones y al layout
        val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)
        val btnGoBack = findViewById<Button>(R.id.btnGoBack)
        val settingsLayout = findViewById<ConstraintLayout>(R.id.settingsLayout)

        // Cambiar el color de fondo al hacer clic en el botón "Cambiar color de fondo"
        btnChangeColor.setOnClickListener {
            settingsLayout.setBackgroundColor(Color.GREEN)  // Cambia el color de fondo a verde
        }

        // Volver a la pantalla de inicio al hacer clic en el botón "Volver a Inicio"
        btnGoBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
