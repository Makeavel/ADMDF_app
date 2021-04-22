package com.mobile.admdf.ui.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mobile.admdf.R
import com.mobile.admdf.model.RealTimeDatabase.DataBaseModel
import kotlinx.android.synthetic.main.fragment_cadastro.*



class CadastroFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    private fun cadastrar() {
        val nome = tv_nomeCad.text.toString()
        val email = tv_emailCad.text.toString()
        val senha = tv_senhaCad.text.toString()
        val confirm_senha = tv_confirmSenhaCad.text.toString()
        //val validador = AuthEmail()
        val dataBase = DataBaseModel()
        //val authUser = AuthUser()

        if(senha != confirm_senha  ){
            Toast.makeText(activity, "Senha inválida", Toast.LENGTH_LONG).show()
            return
        }
        if( senha != confirm_senha ){  // colocar condição de email inválido aqui dentro
            Toast.makeText(activity, "Email inválido", Toast.LENGTH_LONG).show()
            return
        }
        else {
            dataBase.cadNameUserDB(nome , "147")
            //authUser.Auth_Cadastro(email, senha, nome)

        }
    }

}


