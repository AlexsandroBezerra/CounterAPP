package com.alexsandrobezerra.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementFloatingActionButton.setOnClickListener {
            counter.increment()
            counterTextView.text = counter.value.toString()
        }
    }
}