package com.example.evaluation2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.music_item_layout.view.*

class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun setMusic(result: ResultsDTO) {
        itemView.apply {
            result?.run {
                tvArtistName.text = artistName;
                tvCollectionName.text = collectionName;
                tvTrackName.text = trackName;
                Glide.with(context).load(artworkUrl100).into(ivImage)
            }
        }
    }
}