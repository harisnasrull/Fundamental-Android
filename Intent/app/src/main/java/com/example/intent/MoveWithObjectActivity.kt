package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjectActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvMoveWithObject: TextView = findViewById(R.id.tv_data_object)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = """
            Nama = ${person.name}
            Usia = ${person.age.toString()}
            Email = ${person.email}
            Kota = ${person.city}
        """.trimIndent()

        tvMoveWithObject.text = text
    }
}