package com.mobile.admdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_loginMain.setOnClickListener{

            val intencaoDeChamada = Intent(this, LoginActivity::class.java)
            startActivity(intencaoDeChamada)
        }
        bt_cadastroMain.setOnClickListener{

            val intencaoDechamada = Intent(this, CadastroActivity::class.java)
            startActivity(intencaoDechamada)
        }
    }
}


