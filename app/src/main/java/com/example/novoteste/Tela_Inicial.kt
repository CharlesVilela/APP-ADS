package com.example.dsts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tela__inicial.*


class Tela_Inicial: AppCompatActivity() {


       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela__inicial)

        Clinicas.setOnClickListener {
            IrParaClinicas() }
        Provisoria.setOnClickListener {
            IrParaListaIST() }
    }
    private fun IrParaClinicas(){
        val Lista_Clinicas = Intent(this,lista_clinicas::class.java)
        startActivity(Lista_Clinicas)
    }
    private fun IrParaListaIST(){
        val Lista_Ist = Intent(this,tela_ist::class.java)
        startActivity(Lista_Ist)
    }
}

