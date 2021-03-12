package com.mobile.admdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        bt_cadastroCad.setOnClickListener{Cadastramento()}

        bt_voltarCad.setOnClickListener{
            finish()
        }
    }

    private fun Cadastramento(){
        val nome = tv_nomeCad.text.toString()
        val email = tv_emailCad.text.toString()
        val senha = tv_senhaCad.text.toString()
        val senha2 = tv_confirmSenhaCad.text.toString()

        if(senha != senha2){
            Toast.makeText(this,"Senhas incompatíveis", Toast.LENGTH_LONG).show()
        }
        else{
            val auth = FirebaseAuth.getInstance()
            val takeDeCriacao = auth.createUserWithEmailAndPassword(email , senha)

            val dataBase = Firebase.database
            val myReference  = dataBase.getReference(nome) // mandar o nome do cabra para o banco de dados ?


            takeDeCriacao.addOnCompleteListener {
                resposta ->
                    if (resposta.isSuccessful) {
                        finish()
                    }
                    else {
                        Toast.makeText(this, "Falha no Cadastro, tente novamente!", Toast.LENGTH_LONG).show()
                    }
            }
        }

    }

}