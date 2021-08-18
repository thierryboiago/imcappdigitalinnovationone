package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Log.w("lifecycle","CREATE - estou criando a tela")
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle","CREATE - deixei a tela visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle","RESUME - agora você pode interargir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle","PAUSE - a tela perdeu o foco,você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle","STOP - a tela não está mais visível mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle","RESTART - a tela está retomando o foco")
    }

    override fun onDestroy() {
        Log.w("lifecycle","DESTROY - a tela foi destruida")
        super.onDestroy()

    }
}