package com.mobile.admdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_visit.*

class VisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visit)

        //bt_enviar.setOnClickListener{
        //    Visitante()
        //}
        //bt_voltar.setOnClickListener{
        //    finish()
        //}

        switchIgreja.setOnClickListener{

            if(switchIgreja.isChecked){
                tv_nomeIgrejaVisit.isInvisible
            }
            else{
                tv_nomeIgrejaVisit.visibility
            }
        }

    }


    private fun Visitante(){

        val nomeVisit = tv_nomeVisit.text.toString()

    }

}