package com.minna.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        roll_button.setOnClickListener {
            rollDice()
        }

        count_up_button.setOnClickListener {
            if(result_text.text == "Hello World!" ){
                result_text.text = "1"

            }else if(result_text.text == "6"){
                roll_button.isEnabled = false
                Toast.makeText(this, "Counter has reach 6", Toast.LENGTH_SHORT).show()
            }
        }
    }

     fun rollDice(){
       //Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show()

        val quickNumber:Int = edt_number.text.toString().toInt()

        val randomInt = Random().nextInt(6) + 1
        result_text.text = randomInt.toString()

         edt_number.text.isEmpty().apply {
              txt_congratulation.text = "EditText Cannot be empty please a number"
         }

        if (quickNumber == randomInt){
            txt_congratulation.text = "Congratulation you guessed right YAY!!!!"
        }
    }



}
