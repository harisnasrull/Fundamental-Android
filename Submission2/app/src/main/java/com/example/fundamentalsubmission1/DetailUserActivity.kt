package com.example.fundamentalsubmission1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.fundamentalsubmission1.model.User
import kotlinx.android.synthetic.main.activity_detail_user.*

class DetailUserActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val data = intent.getParcelableExtra<User>(EXTRA_USER)
        val location = "Location : ${data?.location}"
        val repository = "Repository : ${data?.repository}"
        val company = "Company : ${data?.company}"

        if (data != null){
            Glide.with(applicationContext).load(data.avatar).into(detail_image)
            detail_name.text = data.name
            detail_username.text = data.username
            detail_location.text = location
            detail_repository.text = repository
            detail_company.text = company
            detail_followers.text = data.follower.toString()
            detail_following.text = data.following.toString()
        }
    }
}