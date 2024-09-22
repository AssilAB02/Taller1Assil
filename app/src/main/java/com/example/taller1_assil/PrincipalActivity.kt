package com.example.taller1_assil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
class PrincipalActivity {

    class PrincipalActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.principal_activity) // Asegúrate de tener un archivo XML llamado activity_principal.xml
        }
    }

}