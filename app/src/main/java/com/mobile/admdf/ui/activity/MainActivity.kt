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

        bt_loginMain.setOnClickListener{
            val intencaoDeChamada = Intent(this, MenuActivity::class.java)
            //val intencaoDeChamada = Intent(this, LoginActivity::class.java)   //-> Não esquece de voltar ao normal animal
            startActivity(intencaoDeChamada)
        }
        bt_cadastroMain.setOnClickListener{

            val intencaoDechamada = Intent(this, CadastroActivity::class.java)
            startActivity(intencaoDechamada)
        }
    }
}


