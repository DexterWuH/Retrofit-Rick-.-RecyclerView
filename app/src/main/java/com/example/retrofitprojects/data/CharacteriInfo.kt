package com.example.retrofitprojects.data

import com.google.gson.annotations.SerializedName

data class CharacteriInfo(
    val count: Int? = null,
    val pages: Int? = null,
    val next: String? = null,
    @SerializedName("prev")
    val previous: String? = null

)
