package com.mobile.admdf.model.RealTimeDatabase

import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.*

open class DataBaseModel {

    // Usuário abre as páginas de cadastro dos motivos e quando chega aqui eles vão para o DB,

    //https://firebase.google.com/docs/database/android/read-and-write?authuser=0

    //private val dataBase = Firebase.database
    //private val myRef = dataBase.getReference( )


    fun visitDB ( nome : String , igreja : String , convidado : String , acomp : String) : Boolean  {

        return true
    }

    fun avisoDB ( nome : String , aviso : String) : Boolean {

        return true
    }

    fun aniverDB ( nome : String , data : Date , idade : Int) : Boolean {

        return true
    }

    fun acaoGraceDB ( nome: String , motivo : String ) : Boolean {

        return true
    }

    fun cadNameUserDB ( nome: String , id : String) : Boolean {

        //val myRef = dataBase.getReference( )
        //myRef.setValue(nome)

        return true
    }

}