package com.mobile.admdf.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.admdf.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        buttonVisit.setOnClickListener{
            val intencaoDeChamada = Intent(this, VisitListActivity::class.java)
            startActivity(intencaoDeChamada)
        }

        bt_mais.setOnClickListener{
            val intencaoChamada = Intent(this, VisitActivity::class.java )
            startActivity(intencaoChamada)
        }

    }

}