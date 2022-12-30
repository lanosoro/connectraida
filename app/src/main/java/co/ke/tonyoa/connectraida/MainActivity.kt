package co.ke.tonyoa.connectraida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.ke.tonyoa.connectraida.databinding.ActivityMainBinding
import co.ke.tonyoa.connectraida.databinding.BottomsheetFragBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val bottomSheetFragment  = BottomSheetFragment()
        binding.signup.setOnClickListener { bottomSheetFragment.show(supportFragmentManager,"Signup bottomsheet") }
        binding.login.setOnClickListener {  }
        }
    }
