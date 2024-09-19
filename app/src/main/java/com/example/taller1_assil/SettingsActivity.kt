package com.example.taller1_assil
import MainActivity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class SettingsActivity {

    class SettingsActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_settings)

            val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)
            val btnGoBack = findViewById<Button>(R.id.btnGoBack)

            // Cambiar el color de fondo al hacer clic en el botón
            btnChangeColor.setOnClickListener {
                findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.settingsLayout).setBackgroundColor(Color.GREEN)
            }

            // Volver a la pantalla de inicio
            btnGoBack.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

}