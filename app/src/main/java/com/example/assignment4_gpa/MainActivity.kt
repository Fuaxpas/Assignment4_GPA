package com.example.assignment4_gpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnok.setOnClickListener {
            var cd1 = c1.text.toString()
            var cd2 = c2.text.toString()
            var cd3 = c3.text.toString()
            var cd4 = c4.text.toString()
            var cd5 = c5.text.toString()
            var p1 = editTextNumberDecimal.text.toString()
            var p2 = editTextNumberDecimal2.text.toString()
            var p3 = editTextNumberDecimal3.text.toString()
            var p4 = editTextNumberDecimal4.text.toString()
            var p5 = editTextNumberDecimal6.text.toString()
            var s1 = editTextTextPersonName.text.toString()
            var s2 = editTextTextPersonName2.text.toString()
            var s3 = editTextTextPersonName3.text.toString()
            var s4 = editTextTextPersonName4.text.toString()
            var s5 = editTextTextPersonName5.text.toString()

            if (cd1.isEmpty() || cd2.isEmpty()|| cd3.isEmpty()|| cd4.isEmpty()|| cd5.isEmpty()) {
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input All Text Box Before Press OK!!",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (p1.isEmpty() || p2.isEmpty()|| p3.isEmpty()|| p4.isEmpty()|| p5.isEmpty()) {
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input All Text Box Before Press OK!!",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (s1.isEmpty() || s2.isEmpty()|| s3.isEmpty()|| s4.isEmpty()|| s5.isEmpty()) {
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input All Text Box Before Press OK!!",
                    Toast.LENGTH_SHORT
                ).show()
            }

            var total = cd1.toInt() + cd2.toInt() + cd3.toInt() + cd4.toInt() + cd5.toInt()
            textView16.text = total.toString()
            var sum = 0.0
            sum += (cd1.toDouble() * p1.toDouble()) + (cd2.toDouble() * p2.toDouble()) + (cd3.toDouble() * p3.toDouble()) + (cd4.toDouble() * p4.toDouble()) + (cd5.toDouble() * p5.toDouble())
            textView17.text = String.format("%.2f", sum / total)
        }

        btnc.setOnClickListener {
            c1.text.clear()
            c2.text.clear()
            c3.text.clear()
            c4.text.clear()
            c5.text.clear()
            editTextNumberDecimal.text.clear()
            editTextNumberDecimal2.text.clear()
            editTextNumberDecimal3.text.clear()
            editTextNumberDecimal4.text.clear()
            editTextNumberDecimal6.text.clear()
            editTextTextPersonName.text.clear()
            editTextTextPersonName2.text.clear()
            editTextTextPersonName3.text.clear()
            editTextTextPersonName4.text.clear()
            editTextTextPersonName5.text.clear()
            textView16.text = ""
            textView17.text = ""
        }
    }
}
