package co.ke.tonyoa.connectraida

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import co.DriverSignActivity

import co.SignupActivity
import co.ke.tonyoa.connectraida.databinding.ActivityMainBinding
import co.ke.tonyoa.connectraida.databinding.BottomsheetFragBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetFragment: BottomSheetDialogFragment(){
    private var _binding: BottomsheetFragBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BottomsheetFragBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.BtnDriverReg.setOnClickListener{
            Toast.makeText(context, "Registering as a Driver", Toast.LENGTH_SHORT).show()

            startActivity(Intent(requireContext(),DriverSignActivity::class.java))

        }
        binding.BtnPoolerReg.setOnClickListener {
            Toast.makeText(context, "Registering as a Pooler", Toast.LENGTH_SHORT).show()

            startActivity(Intent(requireContext(),SignupActivity::class.java))}
    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.bottomsheet_frag,container,false)
//    }
//    private lateinit var binding: BottomsheetFragBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = BottomsheetFragBinding(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        pooler_reg.setOnClickListener{
//            Toast.makeText(context, "Register as a Pooler", Toast.LENGTH_SHORT).show()
//        }
//        Driver_reg.setOnClickListener{
//            Toast.makeText(context, "Register as a Driver", Toast.LENGTH_SHORT).show()
//        }
//
//    }
}