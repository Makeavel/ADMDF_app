package com.mobile.admdf.ui.fragment.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mobile.admdf.R
import com.mobile.admdf.databinding.FragmentFirstScreenBinding


class FirstScreenFragment : Fragment() {

    private lateinit var binding : FragmentFirstScreenBinding

    fun runLogin(v : View){
        findNavController().navigate(R.id.action_firstScreenFragment_to_loginFragment)
    }

   fun runCadastro(v : View){
        findNavController().navigate(R.id.action_firstScreenFragment_to_cadastroFragment)
   }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstScreenBinding.inflate(inflater , container , false)
        binding.fragment = this
        binding.lifecycleOwner = this

        return binding.root
    }


}