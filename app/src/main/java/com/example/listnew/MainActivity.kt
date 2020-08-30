package com.example.listnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //izsauc ListView piemēru
        fun openListView(view:View) {
            val intentListView = Intent(this, ListViewActivity::class.java)

            startActivity(intentListView)
        }
    }
}