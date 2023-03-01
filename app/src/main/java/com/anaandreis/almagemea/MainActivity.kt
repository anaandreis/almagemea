package com.anaandreis.almagemea

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.time.LocalDate
import kotlin.random.Random
import androidx.core.content.ContextCompat.getSystemService
import java.time.Month

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton: Button = findViewById(R.id.button_almagemea)
        firstButton.setOnClickListener { getDate() }

    }

    private fun getDate() {
        val firstButton: Button = findViewById(R.id.button_almagemea)
        firstButton.visibility=View.GONE
        val day = (1..30).random()
        val month = (1..12).random()
        val dayTextView = findViewById<TextView>(R.id.textView_day)
        val monthTextView = findViewById<TextView>(R.id.textView_month)
        val slash = findViewById<TextView>(R.id.slash)
        val dia = findViewById<TextView>(R.id.textView_date)
        dayTextView.text = day.toString()
        monthTextView.text = month.toString()

        dia.visibility=View.VISIBLE
        slash.visibility=View.VISIBLE
        dayTextView.visibility = View.VISIBLE
        monthTextView.visibility = View.VISIBLE
        getSigno(month,day)

    }

    private fun getSigno(month: Int, day: Int) {
        val signo : ImageView = this.findViewById(R.id.imageView_signo)
        signo.visibility=View.VISIBLE
        val signoText: TextView = findViewById(R.id.signoText)

        if (month == 1 && day<=21){
            signo.setImageResource(R.drawable.capri)
            signoText.text = getString(R.string.capricorn)
        }
        else if(month == 1 && day>22) {
            signo.setImageResource(R.drawable.aquario)
            signoText.text = getString(R.string.aquarius)
        }
        else if(month == 2 && day<=19) {
            signo.setImageResource(R.drawable.aquario)
            signoText.text = getString(R.string.aquarius)
        }
        else if(month == 2 && day>20) {
            signo.setImageResource(R.drawable.peixes)
            signoText.text = getString(R.string.peixes)
        }
        else if(month == 3 && day<=20) {
            signo.setImageResource(R.drawable.peixes)
            signoText.text = getString(R.string.peixes)
        }
        else if(month == 3 && day>20) {
            signo.setImageResource(R.drawable.aries)
            signoText.text = "Aries"
        }
        else if(month == 4 && day<=21) {
            signo.setImageResource(R.drawable.aries)
            signoText.text = "Aries"
        }
        else if(month == 4 && day>21) {
            signo.setImageResource(R.drawable.touro)
            signoText.text = "Touro"
        }
        else if(month == 5 && day<=22) {
            signo.setImageResource(R.drawable.touro)
            signoText.text = "Touro"
        }
        else if(month == 5 && day>22) {
            signo.setImageResource(R.drawable.gemeo)
            signoText.text = "Gêmeos"
        }
        else if(month == 6 && day<=21) {
            signo.setImageResource(R.drawable.gemeo)
            signoText.text = "Gêmeos"
        }
        else if(month == 6 && day>21) {
            signo.setImageResource(R.drawable.cancer)
            signoText.text = "Cancer"
        }
        else if(month == 7 && day<=23) {
            signo.setImageResource(R.drawable.cancer)
            signoText.text = "Cancer"
        }
        else if(month == 7 && day>23) {
            signo.setImageResource(R.drawable.leo)
            signoText.text = "Leão"
        }
        else if(month == 8 && day<=23) {
            signo.setImageResource(R.drawable.leo)
            signoText.text = "Leão"
        }
        else if(month == 8 && day>24) {
            signo.setImageResource(R.drawable.virgo)
            signoText.text = "Virgem"
        }
        else if(month == 9 && day<=24) {
            signo.setImageResource(R.drawable.virgo)
            signoText.text = "Virgem"
        }
        else if(month == 9 && day>24) {
            signo.setImageResource(R.drawable.libra)
            signoText.text = "Libra"
        }
        else if(month == 10 && day<=23) {
            signo.setImageResource(R.drawable.libra)
            signoText.text = "Libra"
        }
        else if(month == 10 && day>23) {
            signo.setImageResource(R.drawable.escor)
            signoText.text = "Escorpião"
        }
        else if(month == 11 && day<=24) {
            signo.setImageResource(R.drawable.libra)
            signoText.text = "Escorpião"
        }
        else if(month == 11 && day>24) {
            signo.setImageResource(R.drawable.sag)
            signoText.text = "Sagitário"
        }
        else if(month == 12 && day<=23) {
            signo.setImageResource(R.drawable.sag)
            signoText.text = "Sagitário"
        }
        else  {
            signo.setImageResource(R.drawable.sag)
            signoText.text = "Sagitário"
        }

        }
    }

