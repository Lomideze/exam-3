package com.example.exam3

import androidx.annotation.DrawableRes

data class ItemData(
    @DrawableRes
    val iconImage: Int,
    val userImage: Int,
    val title: String,
    val language: String
)
