package com.mobile.admdf.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.admdf.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intencaoDechamada = Intent(this, CadastroActivity::class.java)
        startActivity(intencaoDechamada)
    }
}

//   https://firebase.google.com/docs/database/android/structure-data?hl=pt-br   //