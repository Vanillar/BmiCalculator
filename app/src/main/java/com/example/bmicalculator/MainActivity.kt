package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var resultButton: Button
    lateinit var heightEditText: EditText
    lateinit var weightEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultButton = findViewById<Button>(R.id.resultButton)
        heightEditText =findViewById<EditText>(R.id.heighteditText)
        weightEditText=findViewById<EditText>(R.id.weightEditText)
        resultButton.setOnClickListener{
            var intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("height",heightEditText.text.toString())
            intent.putExtra("weight", weightEditText.text.toString())
            startActivity(intent)
        }
    }
}