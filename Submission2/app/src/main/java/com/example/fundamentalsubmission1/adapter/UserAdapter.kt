package com.example.fundamentalsubmission1.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fundamentalsubmission1.DetailUserActivity
import com.example.fundamentalsubmission1.R
import com.example.fundamentalsubmission1.model.User
import kotlinx.android.synthetic.main.user_layout.view.*

class UserAdapter(private var list: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.VH>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_layout,parent,false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindData(list[position])
    }

    override fun getItemCount(): Int = list.size

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(data: User){
            with(itemView){
                Glide.with(this).load(data.avatar).into(img_user)
                tv_name.text = data.name
                setOnClickListener {
                    val intent = Intent(context, DetailUserActivity::class.java)
                    intent.putExtra(DetailUserActivity.EXTRA_USER, data)
                    context.startActivity(intent)
                }
            }
        }
    }
}