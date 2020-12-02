package com.example.examenochoajonnathan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.examenochoajonnathan.databinding.FragmentLoginBinding


class Login : Fragment() {
    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.buttonLogin.setOnClickListener { view: View ->
            if (binding.txtUsuario.getText().toString().equals("admin") && binding.txtContrasena.getText().toString().equals("admin"))

            view.findNavController().navigate(LoginDirections.actionLoginToInicio())

        }

        binding.buttonRegistro.setOnClickListener { view: View ->


            view.findNavController().navigate(LoginDirections.actionLoginToRegistro())



            }






        return binding.root
    }


}