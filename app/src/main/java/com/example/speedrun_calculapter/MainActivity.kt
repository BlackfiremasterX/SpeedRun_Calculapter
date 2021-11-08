package com.example.speedrun_calculapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tv_one.setOnClickListener {Text_in_Field("1",true) }
        tv_two.setOnClickListener {Text_in_Field("2",true) }
        tv_three.setOnClickListener {Text_in_Field("3",true) }
        tv_four.setOnClickListener {Text_in_Field("4",true) }
        tv_five.setOnClickListener {Text_in_Field("5",true) }
        tv_six.setOnClickListener {Text_in_Field("6",true) }
        tv_seven.setOnClickListener {Text_in_Field("7",true) }
        tv_eight.setOnClickListener {Text_in_Field("8",true) }
        tv_nine.setOnClickListener {Text_in_Field("9",true) }
        tv_zero.setOnClickListener {Text_in_Field("0",true) }

        tv_ac.setOnClickListener {tv_expression.text = ""}
        tv_back.setOnClickListener {  }

    }

    fun Text_in_Field(str: String, clean: Boolean) {
        if(tv_result.text.isNotEmpty())
        {
            tv_expression.text = ""
        }
        if(clean)
        {
            tv_result.text = ""
            tv_expression.append(str)
        }
        else
        {
            tv_expression.append(tv_result.text)
            tv_expression.append(str)
            tv_result.text = ""
        }
    }
}