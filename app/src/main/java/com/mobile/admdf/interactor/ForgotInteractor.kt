package com.mobile.admdf.interactor

import android.util.Log
import com.mobile.admdf.model.Auth.AuthEmail
import com.mobile.admdf.model.Auth.AuthUser

class ForgotInteractor {

    val authUser: AuthUser = AuthUser("", "")
    val emailValidator: AuthEmail = AuthEmail("")

    fun signinWithUser(email : String ) {
        authUser.email = email
        emailValidator.email = email

        if (emailValidator.isEmailValid())
            authUser.auth_forgot()
        else {
            Log.d("AUTH", "Invalid Email")
            throw Error("Formato de Email Inválido")
        }
    }

}