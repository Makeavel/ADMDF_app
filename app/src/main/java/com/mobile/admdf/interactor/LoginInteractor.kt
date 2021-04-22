package com.mobile.admdf.interactor

import android.util.Log
import com.mobile.admdf.model.Auth.AuthEmail
import com.mobile.admdf.model.Auth.AuthUser

class LoginInteractor {

    val authUser: AuthUser = AuthUser("", "")
    val emailValidator: AuthEmail = AuthEmail("")

    fun loginUser(email : String , pass : String) {
        authUser.email = email
        emailValidator.email = email
        authUser.senha = pass

        if (emailValidator.isEmailValid())
            authUser.auth_login()
        else {
            Log.d("AUTH", "Invalid Email")
            throw Error("Formato de Email Inválido")
        }
    }
}