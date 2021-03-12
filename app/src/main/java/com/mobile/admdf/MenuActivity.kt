package com.mobile.admdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        bt_visitante.setOnClickListener{
            val intencaoDeChamada = Intent(this, VisitActivity::class.java)
            startActivity(intencaoDeChamada)
        }

    }

}