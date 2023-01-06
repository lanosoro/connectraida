package co

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import co.ke.tonyoa.connectraida.R

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val buttonClick = findViewById<Button>(R.id.Next_Pooler)
        buttonClick.setOnClickListener {
            val intent = Intent(this, DriverParticularsActivity::class.java)
            startActivity(intent)
        }

    }
}