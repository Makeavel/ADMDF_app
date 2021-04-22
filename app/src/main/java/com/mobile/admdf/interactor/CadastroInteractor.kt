package com.mobile.admdf.interactor

import android.util.Log
import com.mobile.admdf.model.Auth.AuthEmail
import com.mobile.admdf.model.Auth.AuthUser

class CadastroInteractor {

    val authUser: AuthUser = AuthUser("", "")
    val emailValidator: AuthEmail = AuthEmail("")

    fun createUserAndSignIn(email : String , senha : String , confirmsenha : String) {
        authUser.email = email
        emailValidator.email = email
        authUser.senha = senha

        if (senha != confirmsenha) {
            Log.d("AUTH", "Wrong Password")
            throw Error("Senhas Diferentes")
        }

        if (emailValidator.isEmailValid())
            authUser.auth_Cadastro()
        else {
            Log.d("AUTH", "Invalid Email")
            throw Error("Formato de Senha inválido")
        }
    }

}