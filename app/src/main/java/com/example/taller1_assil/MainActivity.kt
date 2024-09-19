import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.example.taller1_assil.PrincipalActivity
import com.example.taller1_assil.R
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontrar las vistas por su ID
        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        val btnMainActivity = findViewById<Button>(R.id.btnMainActivity)

        // Obtener la hora actual usando Calendar
        val calendar: Calendar = Calendar.getInstance()
        val hour: Int = calendar.get(Calendar.HOUR_OF_DAY)

        // Definir el saludo según la hora del día
        val greeting = when (hour) {
            in 6..11 -> "Buenos días"
            in 12..17 -> "Buenas tardes"
            else -> "Buenas noches"
        }

        // Mostrar el saludo en el TextView
        greetingTextView.text = greeting

        // Configurar el botón para ir a la Actividad Principal
        btnMainActivity.setOnClickListener {
            val intent = Intent(this, PrincipalActivity::class.java)
            startActivity(intent)
        }
    }
}
