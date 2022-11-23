package com.example.zd8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun onClickList(view: View)
    {
        var intent2 = Intent(this,ListModel::class.java)
        startActivity(intent2)
    }

    fun onClickAdd(view: View)
    {
        var intent1 = Intent(this,AddTack::class.java)
        startActivity(intent1)
    }




}