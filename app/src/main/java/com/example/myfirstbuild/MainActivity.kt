package com.example.myfirstbuild

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//    private val num1 = findViewById<EditText>(R.id.editTextNumber);
//    private val num2 = findViewById<EditText>(R.id.editTextNumber2);
//    private val add: Button = findViewById<Button>(R.id.button);
//    private val answer = findViewById<TextView>(R.id.textView);

//    private val EditText = num1;
//    private val EditText2 = num2;
//    private val Button = add;
//    private val TextView = answer;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View?) {
        val answer: TextView = findViewById<TextView>(R.id.textView);
        var num1: EditText = findViewById<EditText>(R.id.editTextNumber);
        var num2: EditText = findViewById<EditText>(R.id.editTextNumber2);
        val Bt: Button = findViewById<Button>(R.id.button);

        Bt.setOnClickListener {
            answer.text = "Result:" + num1.text.toString().toInt() + num2.text.toString().toInt()
        }

    }
}