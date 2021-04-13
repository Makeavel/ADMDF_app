package com.mobile.admdf.model.RealTimeDatabase

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.*

open class DataBaseModel {

    // Usuário abre as páginas de cadastro dos motivos e quando chega aqui eles vão para o DB,
    //
    private val authBase = Firebase.database


    fun VisitDB ( nome : String , igreja : String , convidado : String , acomp : String) : Boolean  {

        return true
    }

    fun AvisoDB ( nome : String , aviso : String) : Boolean {

        return true
    }

    fun AniverDB ( nome : String , data : Date , idade : Int) : Boolean {

        return true
    }

    fun acaoGraceDB ( nome: String , motivo : String ) : Boolean {

        return true
    }

    fun cadNameUserDB ( nome: String , id : String) : Boolean {


        return true
    }

}