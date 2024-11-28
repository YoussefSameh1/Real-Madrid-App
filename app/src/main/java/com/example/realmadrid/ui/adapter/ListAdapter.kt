package com.example.realmadrid.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.realmadrid.R
import com.example.realmadrid.data.Player

class ListAdapter(
    private val players: List<Player>,
    private val onItemClick: (Player) -> Unit // Pass the click listener as a lambda
) : RecyclerView.Adapter<ListAdapter.CardViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.player_image)
        val textView: TextView = itemView.findViewById(R.id.player_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.player, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val player = players[position]
        holder.imageView.setImageResource(player.image)
        holder.textView.text = player.name
        // Set the click listener for the entire view
        holder.itemView.setOnClickListener {
            onItemClick(player) // Invoke the click listener with the player object
        }
    }

    override fun getItemCount(): Int {
        return players.size
    }
}
