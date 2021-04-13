package com.mobile.admdf.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.mobile.admdf.R
import com.mobile.admdf.model.Auth.AuthUser
import kotlinx.android.synthetic.main.activity_forgot.*

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        bt_enviarForgot.setOnClickListener{

            val email = tv_emailForgot.text.toString()
            val auth = AuthUser()

            auth.Auth_forgot(email)
            }
        }
    }
