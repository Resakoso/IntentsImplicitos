package com.example.intentsimplcitos

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.BtnWeb).setOnClickListener{
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, "https://www.jesuitasrioja.org/")
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.BtnUbi).setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data =  Uri.parse("geo:42.45887630999575, -2.4532265841108445")
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.BtnMail).setOnClickListener{

            val intent = Intent(Intent.ACTION_SENDTO).apply{
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, "dam07.2021@gmail.com")
                putExtra(Intent.EXTRA_SUBJECT, "Correo de prueba")
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.BtnTelf).setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:66439924")
            }
            startActivity(intent)
        }
    }
}