package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity : Button = findViewById(R.id.btn_explicit)
        val btnMoveActivityWithData : Button = findViewById(R.id.btn_explicit_data)
        val btnMoveActivityWithObject : Button = findViewById(R.id.btn_explicit_object)
        val btnDial : Button = findViewById(R.id.btn_implicit)
        val btnResultActivity : Button = findViewById(R.id.btn_result_data)

        btnMoveActivity.setOnClickListener(this)
        btnMoveActivityWithData.setOnClickListener(this)
        btnMoveActivityWithObject.setOnClickListener(this)
        btnDial.setOnClickListener(this)
        btnResultActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_explicit -> {
                val intent = Intent(this,MoveActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_explicit_data -> {
                val intent = Intent(this,MoveWithDataActivity::class.java)
                intent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Nasuru")
                startActivity(intent)
            }
            R.id.btn_explicit_object -> {
                val intent = Intent(this,MoveActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_implicit -> {
                val intent = Intent(this,MoveActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_result_data -> {
                val intent = Intent(this,MoveActivity::class.java)
                startActivity(intent)
            }
        }
    }
}