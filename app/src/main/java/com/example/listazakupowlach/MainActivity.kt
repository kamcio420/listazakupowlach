package com.example.listazakupowlach

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCheckBox1 = findViewById<CheckBox>(R.id.checkBox)
        val mCheckBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val mCheckBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val mCheckBox4 = findViewById<CheckBox>(R.id.checkBox4)
        val mCheckBox5 = findViewById<CheckBox>(R.id.checkBox5)
        val mButton = findViewById<Button>(R.id.button)
        val mTextView1 = findViewById<TextView>(R.id.textView3)
        val mTextView2 = findViewById<TextView>(R.id.textView4)
        val mTextView3 = findViewById<TextView>(R.id.textView5)
        val mTextView4 = findViewById<TextView>(R.id.textView6)
        val mTextView5 = findViewById<TextView>(R.id.textView7)

        mButton.setOnClickListener {
            if (mCheckBox1.isChecked) {
                mTextView1.text = "Mleko"
            }
            else {
                mTextView1.text = ""
            }
            if (mCheckBox2.isChecked) {
                mTextView2.text = "Cukier"
            }
            else {
                mTextView2.text = ""
            }
            if (mCheckBox3.isChecked) {
                mTextView3.text = "Chleb"
            }
            else {
                mTextView3.text = ""
            }
            if (mCheckBox4.isChecked) {
                mTextView4.text = "Masło"
            }
            else {
                mTextView4.text = ""
            }
            if (mCheckBox5.isChecked) {
                mTextView5.text = "Herbata"
            }
            else {
                mTextView5.text = ""
            }
        }
    }
}
