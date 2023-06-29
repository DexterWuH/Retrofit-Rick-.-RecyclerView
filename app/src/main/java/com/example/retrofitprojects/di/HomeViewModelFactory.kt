package com.example.retrofitprojects.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.retrofitprojects.repository.CharacterRepository
import com.example.retrofitprojects.repository.CharacterRepositoryContract
import com.example.retrofitprojects.ui.home.HomeViewModel

object HomeViewModelFactory : ViewModelProvider.Factory {

    private val characterRepository: CharacterRepositoryContract by lazy {
        CharacterRepository()
    }

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if (modelClass.isAssignableFrom((HomeViewModel::class.java))) {
            return HomeViewModel(characterRepository) as T
        }
        throw  IllegalAccessException("You must provide a HomeViewModel ty")

    }

    }
