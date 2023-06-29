package com.example.retrofitprojects.data

data class CharacterResopnse(
    val info : CharacteriInfo? = null,
    val results:List<CharacterResult> = emptyList(),

) {
}
