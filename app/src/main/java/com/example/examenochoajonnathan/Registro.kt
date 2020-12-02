package com.example.examenochoajonnathan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.examenochoajonnathan.databinding.FragmentRegistroBinding


class Registro : Fragment() {

    private lateinit var binding:FragmentRegistroBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_registro,container,false)
        binding.buttonRegistro.setOnClickListener { view: View ->
            view.findNavController().navigate(RegistroDirections.actionRegistroToInicio())
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}