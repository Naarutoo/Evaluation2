package com.example.evaluation2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(var list: List<ResultsDTO>) : RecyclerView.Adapter<MusicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.music_item_layout,parent,false);
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
holder.setMusic(list[position])
    }

    override fun getItemCount(): Int {
        return list.size;

    }
}