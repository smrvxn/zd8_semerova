package com.example.zd8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AddTack : AppCompatActivity() {

    lateinit var title: EditText
    lateinit var time: EditText
    lateinit var data: EditText
    lateinit var text: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_tack)

        title = findViewById(R.id.task_title1)
        time = findViewById(R.id.task_time1)
        data = findViewById(R.id.task_data1)
        text = findViewById(R.id.task_text1)
    }

    fun onClick1(view: View)
    {
        if(title.text.isNotEmpty() && time.text.isNotEmpty() && data.text.isNotEmpty() && text.text.isNotEmpty()) {

            var toast = Toast.makeText(applicationContext, "Данные сохранены!", Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("!!!ОШИБКА!!!")
                .setMessage("Заполните все поля")
                .setPositiveButton("ok",null)
                .create()
                .show()
        }

    }

    fun onClickBack(view: View)
    {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}