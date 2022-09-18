package com.example.tapcounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.tapcounterapp.R.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var counter = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button);
        val textView = findViewById<TextView>(R.id.textView);
        val button2 = findViewById<Button>(R.id.button2)
        var increaseBy = 1;

        button2.setOnClickListener{
            increaseBy = 2;
            button2.visibility = View.INVISIBLE;
        }

        button.setOnClickListener {
            // Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show();
            counter += increaseBy;
            textView.text = counter.toString();
            if (counter >= 10 && increaseBy == 1) {
                button2.visibility = View.VISIBLE;
            }
        }
    }
}