package com.mobile.admdf.ui.fragment.Forgot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobile.admdf.R
import com.mobile.admdf.model.Auth.AuthUser
import kotlinx.android.synthetic.main.fragment_forgot.*


class ForgotFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bt_enviarForgot.setOnClickListener{ forgot() }


        return inflater.inflate(R.layout.fragment_forgot, container, false)
    }

    private fun forgot (){

        val email = tv_emailForgot.text.toString()
        val auth = AuthUser()

        auth.Auth_forgot(email)

    }
}


