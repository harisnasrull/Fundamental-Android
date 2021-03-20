package com.example.fundamentalsubmission1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user : ArrayList<User> = UserData.getListData()

        adapter = UserAdapter(user)
        rv_user.setHasFixedSize(true)
        rv_user.layoutManager = LinearLayoutManager(this)
        rv_user.adapter = adapter
    }
}