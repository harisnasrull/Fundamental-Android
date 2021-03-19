package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup

class MoveWithResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnChoose : Button
    private lateinit var rgNumber : RadioGroup

    companion object {
        const val EXTRA_VALUE = "extra_value"
        const val RESULT_CODE = 20
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_result)

        btnChoose = findViewById(R.id.btn_choose)
        rgNumber = findViewById(R.id.rg_number)

        btnChoose.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_choose) {
            if (rgNumber.checkedRadioButtonId > 0) {
                var value = 0
                when (rgNumber.checkedRadioButtonId) {
                    R.id.rb_50 -> value = 50
                    R.id.rb_75 -> value = 75
                    R.id.rb_100 -> value = 100
                    R.id.rb_125 -> value = 125
                }
                val intent = Intent()
                intent.putExtra(EXTRA_VALUE, value)
                setResult(RESULT_CODE,intent)
                finish()
            }
        }
    }
}