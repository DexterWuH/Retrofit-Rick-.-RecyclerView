package com.example.retrofitprojects.di

import com.example.retrofitprojects.newwork.CharacterAPI
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkProvider {
    private const val BASE_URL="https://rickandmortyapi.com/api/"

    private val interceptor: Interceptor by lazy {
        HttpLoggingInterceptor().apply {
            setLevel(HttpLoggingInterceptor.Level.BODY)
        }
    }

    private val okHttpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addNetworkInterceptor(interceptor)
            .build()
    }
    private val retrofit:Retrofit by lazy {
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val characterApi:CharacterAPI by lazy {
        retrofit.create(CharacterAPI::class.java)
    }
}