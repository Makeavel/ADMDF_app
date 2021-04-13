package com.mobile.admdf.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.admdf.R
import kotlinx.android.synthetic.main.activity_fist_screen.*

class FistScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fist_screen)

        bt_loginMain.setOnClickListener{
            val intencaoDeChamada = Intent(this, MenuActivity::class.java)
            startActivity(intencaoDeChamada)
        }

        bt_cadastroMain.setOnClickListener{

            val intencaoDechamada = Intent(this, CadastroActivity::class.java)
            startActivity(intencaoDechamada)
        }


    }


}