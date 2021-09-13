package com.example.novoteste

import Repository.UserRepository
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dsts.R
import com.example.dsts.Tela_Inicial
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity(){

    private var email: String? = null
    private var password: String? = null

    private var tvForgotPassword: TextView? = null
    private var etEmail: TextView? = null
    private var etPassword: TextView? = null
    private var btnLogin: TextView? = null
    private var mProgressBar: ProgressDialog? = null
    private var btnCreateAccount: TextView? = null

    private lateinit var repository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      //  initialize()

        button_ir_register.setOnClickListener {
            IrParaRegister()
        }

        button_login.setOnClickListener {
            IrParaTelaInicial()
        }


    }

    private fun IrParaRegister(){
        val irRegister = Intent(this, Regiter::class.java)
        startActivity(irRegister)
    }

    private fun IrParaTelaInicial(){
        val irTela_Inicial = Intent(this, Tela_Inicial::class.java)
        startActivity(irTela_Inicial)
    }

//    private fun initialize(){
//        tvForgotPassword = findViewById(R.id.inputEmail) as EditText
//        etEmail = findViewById(R.id.inputPassword) as EditText
//        etPassword = findViewById(R.id.inputPassword) as EditText
//        btnLogin = findViewById(R.id.button_login) as Button
//
//        btnLogin!!.setOnClickListener { loginUser() }
//    }

//    private fun loginUser() {
//        email = etEmail?.text.toString()
//        password = etPassword?.text.toString()
//
//        if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){
//            mProgressBar!!.setMessage("Verificando Usuario")
//            mProgressBar!!.show()
//            var user = repository.logar(email!!, password!!)
//
//            if (user != null){
//                IrParaTelaInicial()
//            }
//        }
//    }


}