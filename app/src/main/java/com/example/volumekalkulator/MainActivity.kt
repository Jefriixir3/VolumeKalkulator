package com.example.volumekalkulator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtLength: EditText
    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtLength = findViewById(R.id.edtLength)
        edtWidth = findViewById(R.id.edtWidth)
        edtHeight = findViewById(R.id.edtHeight)
        tvResult = findViewById(R.id.tvResult)
    }

    fun calculateVolume(view: View) {
        val length = edtLength.text.toString().toDoubleOrNull() ?: 0.0
        val width = edtWidth.text.toString().toDoubleOrNull() ?: 0.0
        val height = edtHeight.text.toString().toDoubleOrNull() ?: 0.0

        val volume = length * width * height

        tvResult.text = "Hasil: $volume"
    }
}