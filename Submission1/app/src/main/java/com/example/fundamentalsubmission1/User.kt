package com.example.fundamentalsubmission1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val avatar : Int,
    val name : String,
    val username : String,
    val location : String,
    val repository : Int,
    val company : String,
    val follower : Int,
    val following : Int,
) : Parcelable