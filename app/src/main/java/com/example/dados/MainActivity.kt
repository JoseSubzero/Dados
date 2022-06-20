package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dados = arrayOf(R.drawable.dice1, //Son enteros basados en su indentificaor como si fueran un codigo de barras/etiqueta
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun random(view: View) {
        val d1 = Random.nextInt(1, 7)
        val d2 = Random.nextInt(1, 7)
        binding.ivDado1.setImageResource(dados[d1 -1])
        binding.ivDado2.setImageResource(dados [d2-1])
        binding.tvResultado.text = (d1 + d2).toString()



    }
}