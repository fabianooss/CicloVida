package org.senac.ciclovida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "CICLO-VIDA"

    val QUANTIDADE = "Quantidade"

    lateinit var texto : TextView

    // variável de estado da activity
    // sempre que possuir essa situação, será necessário salvar e restaurar o estado da activity
    var quantidade = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")
        texto = findViewById(R.id.tv_quantidade)
    }

    override fun onStart() {
        Log.i(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }

    override fun onRestart() {
        Log.i(TAG, "onPause")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i(TAG, "Salvando estado da aplicação")
        outState.putInt(QUANTIDADE, this.quantidade)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i(TAG, "Restaurando estado da aplicação")
        super.onRestoreInstanceState(savedInstanceState)
        this.quantidade = savedInstanceState.getInt(QUANTIDADE) ?: 0
        this.texto.text = this.quantidade.toString()
    }

    fun contador(view: View) {
        this.quantidade++
        texto.text = this.quantidade.toString()

    }

    fun abrir(view: View) {

        val i = Intent(this, OutraActivity::class.java)

        startActivity(i)
    }


}
