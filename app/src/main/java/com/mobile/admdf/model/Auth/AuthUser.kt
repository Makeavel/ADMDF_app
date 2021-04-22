package com.mobile.admdf.model.Auth

import com.google.firebase.auth.FirebaseAuth

open class AuthUser(var email : String, var senha : String ) {

    private val auth = FirebaseAuth.getInstance()

    fun auth_Cadastro(){


        val taskDeCadastro = auth.createUserWithEmailAndPassword(email , senha)
        taskDeCadastro.addOnCompleteListener{
               resultado ->
            if (resultado.isSuccessful){


            }
            else{
               // Toast.makeText(this, "Falha no cadastro" , Toast.LENGTH_LONG).show()
            }
        }


    }

    fun auth_login(){


        val taskdeLogin = auth.signInWithEmailAndPassword(email , senha)
        taskdeLogin.addOnCompleteListener{

        }

    }

    fun auth_forgot(){

        val taskforgot = auth.sendPasswordResetEmail(email)
        taskforgot.addOnCompleteListener{

        }


    }


}