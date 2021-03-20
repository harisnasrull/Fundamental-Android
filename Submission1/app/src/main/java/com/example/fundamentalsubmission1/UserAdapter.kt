package com.example.fundamentalsubmission1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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
                tv_username.text = data.username
                setOnClickListener {
                    val intent = Intent(context, DetailUser::class.java)
                    intent.putExtra(DetailUser.EXTRA_USER, data)
                    context.startActivity(intent)
                }
            }
        }
    }
}