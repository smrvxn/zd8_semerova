package com.example.zd8

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var email: EditText
    lateinit var settings: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.login)
        email = findViewById(R.id.usemail)
        password = findViewById(R.id.password)
        settings = getSharedPreferences("NEXT", MODE_PRIVATE)

        if(settings.contains("LOGIN") && settings.contains("EMAIL") && settings.contains("PASS"))
        {
            var log = settings.getString("LOGIN", "NONE")
            var em = settings.getString("EMAIL", "NONE")
            var pass = settings.getString("PASS", "NONE")
            login.setText(log)
            email.setText(em)
            password.setText(pass)
        }
    }

    fun onClick(view: View)
    {
        if(login.text.isNotEmpty() && email.text.isNotEmpty() && password.text.isNotEmpty())
        {
            var editPref = settings.edit()
            editPref.putString("LOGIN",login.text.toString())
            editPref.putString("EMAIL", email.text.toString())
            editPref.putString("PASS", password.text.toString())
            editPref.apply()
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
}