package com.mobile.admdf.ui.fragment.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mobile.admdf.R
import com.mobile.admdf.databinding.FragmentSplashScreenBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenFragment : Fragment() {

    private lateinit var binding : FragmentSplashScreenBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentSplashScreenBinding.inflate(inflater, container , false)
        binding.lifecycleOwner = this

        GlobalScope.launch( context = Dispatchers.Main) {
            delay(4000)
            findNavController()
        }

        return binding.root
    }


}