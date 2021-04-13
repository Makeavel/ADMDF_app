package com.mobile.admdf.ui.fragment.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mobile.admdf.R
import com.mobile.admdf.databinding.FragmentLoginBinding
import com.mobile.admdf.model.Auth.AuthEmail
import com.mobile.admdf.model.Auth.AuthUser
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        bt_loginLogin.setOnClickListener{ login() }



        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    private fun login() {

        val email = tv_emailLogin.text.toString()
        val senha = tv_senhaLogin.text.toString()
        val auth = AuthUser()
        val authemail = AuthEmail()

        if( !(authemail.isEmailValid(email)) ){
            Toast.makeText(activity , "Email Inválido" , Toast.LENGTH_LONG).show()
            return
        }
        else {
            auth.Auth_login(email, senha)
        }
    }

}