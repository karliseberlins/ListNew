package com.example.listnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_grid_view.*
import kotlinx.android.synthetic.main.activity_list_view.*
import kotlinx.android.synthetic.main.activity_main.*

private val items = mutableListOf(
    "Cupcake",
    "Donut",
    "Eclair",
    "Froyo",
    "Gingerbread",
    "Honeycomb",
    "Ice Cream Sandwich",
    "Jelly Bean",
    "KitKat",
    "Lollipop",
    "Marshmallow",
    "Nougat",
    "Oreo",
    "Pie",
    "10",
    "11"
)

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        mainListItems.adapter = adapter

        mainListItems.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this, items[position],
                Toast.LENGTH_SHORT
            ).show()
            Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show()
        }
        //izsauc ListView piemēru
        fun openListView(view: View) {
            val intentListView = Intent(this, ListViewActivity::class.java)

            startActivity(intentListView)
        }

    }
}