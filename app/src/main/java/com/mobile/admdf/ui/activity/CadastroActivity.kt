package com.mobile.admdf.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.mobile.admdf.R
import com.mobile.admdf.model.Auth.AuthEmail
import com.mobile.admdf.model.Auth.AuthUser
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_cadastro.bt_cadastroCad
import kotlinx.android.synthetic.main.activity_cadastro.bt_voltarCad
import kotlinx.android.synthetic.main.activity_cadastro.tv_confirmSenhaCad
import kotlinx.android.synthetic.main.activity_cadastro.tv_emailCad
import kotlinx.android.synthetic.main.activity_cadastro.tv_nomeCad
import kotlinx.android.synthetic.main.activity_cadastro.tv_senhaCad
import kotlinx.android.synthetic.main.fragment_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        bt_cadastroCad.setOnClickListener{ cadastrar() }
        bt_voltarCad.setOnClickListener{ this.finish() }


    }

    private fun cadastrar() {
        val nome = tv_nomeCad.text.toString()
        val email = tv_emailCad.text.toString()
        val senha = tv_senhaCad.text.toString()
        val confirm_senha = tv_confirmSenhaCad.text.toString()
        val validador = AuthEmail()
        val authUser = AuthUser()

        if(senha != confirm_senha  ){
            Toast.makeText(this, "Senha inválida", Toast.LENGTH_LONG).show()
            return
        }
        if( !validador.isEmailValid(email) ){  // colocar condição de email inválido aqui dentro
            Toast.makeText(this, "Email inválido", Toast.LENGTH_LONG).show()
            return
        }
        else {
            authUser.Auth_Cadastro(email, senha, nome)
        }
    }


}