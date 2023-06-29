package com.example.retrofitprojects.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitprojects.data.CharacterResult
import com.example.retrofitprojects.repository.CharacterRepositoryContract
import kotlinx.coroutines.launch

class HomeViewModel(
    private val characterRepository: CharacterRepositoryContract
):ViewModel() {
    val characterResults = MutableLiveData<List<CharacterResult>>()

    fun fetchCharacters(){
        viewModelScope.launch {
            val results = characterRepository.fetchCharacters()
            characterResults.postValue(results)
        }

    }
}