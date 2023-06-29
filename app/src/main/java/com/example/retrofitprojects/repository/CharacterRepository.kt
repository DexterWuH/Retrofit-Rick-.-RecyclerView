package com.example.retrofitprojects.repository

import com.example.retrofitprojects.data.CharacterResult
import com.example.retrofitprojects.di.NetworkProvider
import com.example.retrofitprojects.newwork.CharacterAPI
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface CharacterRepositoryContract {
    suspend fun fetchCharacters(): List<CharacterResult>
}

class CharacterRepository(
    private val characterApi: CharacterAPI = NetworkProvider.characterApi,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO

            ): CharacterRepositoryContract{
        override suspend fun fetchCharacters(): List<CharacterResult> {
    return withContext(dispatcher){
        val response = characterApi.fetchCharacters()
        return@withContext response.results
    }
        }
    }
