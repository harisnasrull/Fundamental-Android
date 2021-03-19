package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editPanjang : EditText
    private lateinit var editLebar : EditText
    private lateinit var editTinggi : EditText
    private lateinit var btnHasil : Button
    private lateinit var tvHasil : TextView

    companion object {
        private const val hasil = "hasil"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPanjang = findViewById(R.id.et_panjang)
        editLebar = findViewById(R.id.et_lebar)
        editTinggi = findViewById(R.id.et_tinggi)
        btnHasil = findViewById(R.id.btn_hasil)
        tvHasil = findViewById(R.id.tv_hasil)

        btnHasil.setOnClickListener(this)

        if (savedInstanceState!=null){
            val hasil = savedInstanceState.getString(hasil)
            tvHasil.text = hasil
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putString(hasil,tvHasil.text.toString())
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_hasil) {
            val inputPanjang = editPanjang.text.toString().trim()
            val inputLebar = editLebar.text.toString().trim()
            val inputTinggi = editTinggi.text.toString().trim()

            var isEmpty = false

            if (inputPanjang.isEmpty()) {
                isEmpty = true
                tvHasil.text = getString(R.string.error)
            }

            if (inputLebar.isEmpty()) {
                isEmpty = true
                tvHasil.text = getString(R.string.error)
            }

            if (inputTinggi.isEmpty()){
                isEmpty = true
                tvHasil.text = getString(R.string.error)
            }

            if (!isEmpty){
                val volume = inputPanjang.toDouble() * inputLebar.toDouble() * inputTinggi.toDouble()
                tvHasil.text = volume.toString()
            }
        }
    }
}