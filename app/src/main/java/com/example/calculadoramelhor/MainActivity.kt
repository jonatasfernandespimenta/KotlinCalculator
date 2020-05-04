package com.example.calculadoramelhor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.textView)
        val btnAdd:        Button = findViewById(R.id.add)
        val btnMinus:      Button = findViewById(R.id.minus)
        val btnDot:        Button = findViewById(R.id.dot)
        val btnBar:        Button = findViewById(R.id.bar)

        val n1: EditText = findViewById(R.id.n1)
        val n2 : EditText = findViewById(R.id.n2)

        btnAdd.setOnClickListener      { calculate(n1, n2, "+") }
        btnMinus.setOnClickListener    { calculate(n1, n2, "-") }
        btnDot.setOnClickListener      { calculate(n1, n2, "*") }
        btnBar.setOnClickListener      { calculate(n1, n2, "/")}

    }

    private fun calculate(num1: EditText, num2: EditText, type: String) {
        when(type) {
            "+" -> resultTextView.text = (num1.text.toString().toDouble() + num2.text.toString().toDouble()).toString()
            "-" -> resultTextView.text = (num1.text.toString().toDouble() - num2.text.toString().toDouble()).toString()
            "*" -> resultTextView.text = (num1.text.toString().toDouble() * num2.text.toString().toDouble()).toString()
            "/" -> resultTextView.text = (num1.text.toString().toDouble() / num2.text.toString().toDouble()).toString()
        }
    }

}
