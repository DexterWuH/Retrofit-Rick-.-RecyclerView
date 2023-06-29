package com.example.retrofitprojects.ui.home.character

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitprojects.R
import com.example.retrofitprojects.data.CharacterResult

class CharacterViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val titleTextView: TextView by lazy {
        itemView.findViewById(R.id.titleTextView)
    }

    private val descriptionTextView: TextView by lazy {
        itemView.findViewById(R.id.descriptionTextView)
    }

    fun bindModelToView(characterResult: CharacterResult){
        titleTextView.text = characterResult.name
        descriptionTextView.text = characterResult.species

    }
}