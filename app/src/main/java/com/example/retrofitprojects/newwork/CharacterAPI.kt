package com.example.retrofitprojects.newwork

import com.example.retrofitprojects.data.CharacterResopnse
import retrofit2.http.GET

interface CharacterAPI {
    @GET("character")
    suspend fun fetchCharacters():CharacterResopnse

}