package com.mobile.admdf.ui.fragment.Cadastro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.mobile.admdf.R
import com.mobile.admdf.model.Auth.AuthEmail
import com.mobile.admdf.model.Auth.AuthUser
import com.mobile.admdf.model.RealTimeDatabase.DataBaseModel
import kotlinx.android.synthetic.main.fragment_cadastro.*


class CadastroFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment

        bt_cadastroCad.setOnClickListener{ cadastrar() }
        bt_voltarCad.setOnClickListener{ activity?.finish() }


        return inflater.inflate(R.layout.fragment_cadastro, container, false)

    }

    private fun cadastrar() {
        val nome = tv_nomeCad.text.toString()
        val email = tv_emailCad.text.toString()
        val senha = tv_senhaCad.text.toString()
        val confirm_senha = tv_confirmSenhaCad.text.toString()
        val validador = AuthEmail()
        val authUser = AuthUser()

        if(senha != confirm_senha  ){
            Toast.makeText(activity, "Senha inválida", Toast.LENGTH_LONG).show()
            return
        }
        if( !validador.isEmailValid(email) ){  // colocar condição de email inválido aqui dentro
            Toast.makeText(activity, "Email inválido", Toast.LENGTH_LONG).show()
            return
        }
        else {
            authUser.Auth_Cadastro(email, senha, nome)
        }
    }

}
