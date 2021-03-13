package com.mobile.admdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
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
                tv_nomeIgrejaVisit.setVisibility(View.VISIBLE)
            }
            else{
                tv_nomeIgrejaVisit.setVisibility(View.INVISIBLE)
            }
        }

        switchConvidado.setOnClickListener{
            if(switchConvidado.isChecked){
                tv_Convidado.setVisibility(View.VISIBLE)
            }
            else{
                tv_Convidado.setVisibility(View.INVISIBLE)
            }
        }


    }


    private fun Visitante(){

        val nomeVisit = tv_nomeVisit.text.toString()

    }

}