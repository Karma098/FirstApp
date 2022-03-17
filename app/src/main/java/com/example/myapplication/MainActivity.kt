package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.btn_submit)
        val txt:EditText=findViewById(R.id.et_text)
        btn.setOnClickListener{
            if(txt.text.toString().isEmpty()){
                Toast.makeText(this, "Enter your name bro", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "HII "+ txt.text +", How are you, Hope u doin' well, go corona go!!", Toast.LENGTH_LONG).show()
            }
        }
    }
}