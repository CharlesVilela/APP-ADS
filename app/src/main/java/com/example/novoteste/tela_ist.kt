package com.example.dsts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tela_ist.*

class tela_ist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_ist)

        AIDS.setOnClickListener {
            IrParaAIDS() }
        SIFILIS.setOnClickListener {
            IrParaSifilis() }
        HPV.setOnClickListener {
            IrParaHpv() }
        HERPES.setOnClickListener {
            IrParaHerpes() }
        CLAMIDIA.setOnClickListener {
            IrParaClamidia() }
        TRICOMONIASE.setOnClickListener {
            IrParaTricomoniase() }
        GONORREIA.setOnClickListener {
            IrParaGonorreia() }
    }
    private fun IrParaAIDS(){
        val texto_Aids = Intent(this,Aids::class.java)
        startActivity(texto_Aids) }
    private fun IrParaSifilis(){
        val texto_Sifilis = Intent(this,com.example.dsts.SIFILIS::class.java)
        startActivity(texto_Sifilis) }
    private fun IrParaHpv(){
        val texto_Hpv = Intent(this,com.example.dsts.HPV::class.java)
        startActivity(texto_Hpv) }
    private fun IrParaHerpes(){
        val texto_Herpes = Intent(this,HErpes::class.java)
        startActivity(texto_Herpes) }
    private fun IrParaClamidia(){
        val texto_Clamidia = Intent(this,CLAmidia::class.java)
        startActivity(texto_Clamidia) }
    private fun IrParaTricomoniase(){
        val texto_Tricomoniase = Intent(this,TRicomoniase::class.java)
        startActivity(texto_Tricomoniase) }
    private fun IrParaGonorreia(){
        val texto_gonorreia = Intent(this,Gonorreia::class.java)
        startActivity(texto_gonorreia) }
}