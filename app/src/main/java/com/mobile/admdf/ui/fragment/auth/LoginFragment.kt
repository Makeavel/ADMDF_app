package com.mobile.admdf.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mobile.admdf.R
import com.mobile.admdf.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    fun forgot(v : View){
        findNavController().navigate(R.id.action_loginFragment_to_forgotFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater , container , false)
        binding.lifecycleOwner = this
        binding.loginFragment = this


        return binding.root
    }

}