package com.example.retrofitprojects.ui.home

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitprojects.R
import com.example.retrofitprojects.di.HomeViewModelFactory
import com.example.retrofitprojects.ui.home.character.CharacterAdapter

class HomeActivity : AppCompatActivity() {

    private val homeViewModel: HomeViewModel by lazy {
        ViewModelProvider(this, HomeViewModelFactory).get(HomeViewModel::class.java)
    }
    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.homeRecyclerView)
    }
    private val characterAdapter: CharacterAdapter by lazy {
        CharacterAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRecyclerView()
        observeViewModel()
        homeViewModel.fetchCharacters()

    }

    private fun setRecyclerView(){
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = characterAdapter
    }

    private fun observeViewModel() {
        homeViewModel.characterResults.observe(this, Observer {
            characterAdapter.addItem(it)
            it.forEach {
                Log.d("HomeActivity", "${it.name}")
            }
        })

    }

}