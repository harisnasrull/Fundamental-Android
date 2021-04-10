package com.nasuru.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
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
    }

    override fun onClick(view: View) {
        if (view.id == binding.btnSetValue.id) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for (i in 0..3) {
                name.append(names[i]).append("\n")
            }
            binding.tvSet.text = name.toString()
        }
    }
}