package com.mobile.admdf.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.mobile.admdf.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_forgotLogin.setOnClickListener{
            val intencaoDeChamada = Intent(this, ForgotActivity::class.java)
            startActivity(intencaoDeChamada)
        }

        bt_loginLogin.setOnClickListener{

            val email = tv_emailLogin.text.toString()
            val senha = tv_senhaLogin.text.toString()
            val auth = FirebaseAuth.getInstance()
            val taskDeLogin = auth.signInWithEmailAndPassword(email,senha)

            taskDeLogin.addOnCompleteListener{
                resultado ->
                if(resultado.isSuccessful){
                    val intencaoDeChamada = Intent(this, MenuActivity::class.java)
                    startActivity(intencaoDeChamada)
                    finish()
                }
                else{
                    Toast.makeText(this,"Email ou Senha Inválida", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}