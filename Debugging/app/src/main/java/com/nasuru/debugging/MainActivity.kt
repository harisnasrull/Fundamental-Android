package com.nasuru.debugging

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.nasuru.debugging.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSetValue.setOnClickListener(this)

        names.add("Narenda Wicaksono")
        names.add("Kevin")
        names.add("Y000oza")

//        binding.imgPreview.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.fronalpstock_big))
        Glide.with(this).load(R.drawable.fronalpstock_big).into(binding.imgPreview)
    }

    override fun onClick(view: View) {
        if (view.id == binding.btnSetValue.id) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            binding.tvSet.text = name.toString()
        }
    }
}