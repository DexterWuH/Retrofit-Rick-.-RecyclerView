package com.example.retrofitprojects.data

import com.google.gson.annotations.SerializedName

data class CharacterResult(
    val id: Long? = null,
    val name: String? = null,
    val status: String? = null,
    val species: String? = null,
    val type: String? = null,
    val gender: String? = null,
    @SerializedName("origin")
    val origin: CharacterMetaData? = null,
    @SerializedName("location")
    val location: CharacterMetaData? = null,
    @SerializedName("episode")
    val episodes: List<String>? = emptyList(),
    val url: String? = null,
    val created: String? = null
)