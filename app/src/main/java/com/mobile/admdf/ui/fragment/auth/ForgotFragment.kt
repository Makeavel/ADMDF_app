package com.mobile.admdf.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.admdf.R
import com.mobile.admdf.databinding.FragmentForgotBinding
import kotlinx.android.synthetic.main.fragment_forgot.*


class ForgotFragment : Fragment() {

    private lateinit var binding : FragmentForgotBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentForgotBinding.inflate( inflater , container , false)
        binding.lifecycleOwner = this



        return binding.root
    }

}


