package com.example.retrofitprojects.ui.home.character

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitprojects.R
import com.example.retrofitprojects.data.CharacterResult

class CharacterAdapter : RecyclerView.Adapter<CharacterViewHolder>() {

    private val items= mutableListOf<CharacterResult>()

    fun addItem(characterResults: List <CharacterResult>){
        this.items.clear()
        this.items.addAll(characterResults)
        notifyDataSetChanged()


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        return CharacterViewHolder(view)

    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val item = items[position]
        holder.bindModelToView(item)
    }

    override fun getItemCount() = items.size
    }
