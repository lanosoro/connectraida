package co

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import co.ke.tonyoa.connectraida.R
import co.ke.tonyoa.connectraida.databinding.ActivityDriverSignBinding

class DriverSignActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDriverSignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_sign)

        val buttonClick = findViewById<Button>(R.id.Next)
        buttonClick.setOnClickListener {
            val intent = Intent(this, DriverParticularsActivity::class.java)
            startActivity(intent)
    }
}}