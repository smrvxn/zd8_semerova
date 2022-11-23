package com.example.zd8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class ListModel : AppCompatActivity() {

    lateinit var title: TextView
    lateinit var time: TextView
    lateinit var data: TextView
    lateinit var text: TextView
    lateinit var spin: Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_model)

        title = findViewById(R.id.title111)
        time = findViewById(R.id.time)
        data = findViewById(R.id.data)
        text = findViewById(R.id.text)
        spin = findViewById(R.id.spinner)


    }

    fun onClickNewTask(view: View)
    {
        if(spin.selectedItem == "Task1")
        {
            title.text = "Task1"
            time.text = "19:00"
            data.text = "12.12.22"
            text.text = "add task1"
        }
        if(spin.selectedItem == "Task2")
        {
            title.text = "Task2"
            time.text = "15:55"
            data.text = "12.10.22"
            text.text = "add project"
        }
        if(spin.selectedItem == "Task3")
        {
            title.text = "Task3"
            time.text = "20:55"
            data.text = "15.11.22"
            text.text = "walk"
        }
        if(spin.selectedItem == "Task4")
        {
            title.text = "Task4"
            time.text = "01:05"
            data.text = "12.11.22"
            text.text = "sleep"
        }
        if(spin.selectedItem == "Task5")
        {
            title.text = "Task5"
            time.text = "10:10"
            data.text = "1.12.22"
            text.text = "go home"
        }
    }



    fun onClickMenu(view: View)
    {
        val intent3 = Intent(this,MenuActivity::class.java)
        startActivity(intent3)
    }
}