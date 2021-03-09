package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val database = Firebase.database
        val nome = findViewById<EditText>(R.id.editText)
        val but = findViewById<Button>(R.id.buttonSubmit)

        but.setOnClickListener{
            val ref = database.getReference("nome")
            ref.setValue(nome.text.toString())
        }
    }
}