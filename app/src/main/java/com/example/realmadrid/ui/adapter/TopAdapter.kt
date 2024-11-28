package com.example.realmadrid.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.realmadrid.R
import com.example.realmadrid.data.Top

class TopAdapter(
    private val tops: List<Top>
) : RecyclerView.Adapter<TopAdapter.CardViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val category: TextView = itemView.findViewById(R.id.category)
        val imageView: ImageView = itemView.findViewById(R.id.player_image)
        val name: TextView = itemView.findViewById(R.id.player_name)
        val record: TextView = itemView.findViewById(R.id.record)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.top_player, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val top = tops[position]
        holder.category.text = top.category
        holder.imageView.setImageResource(top.image)
        holder.name.text = top.name
        holder.record.text = top.record
    }

    override fun getItemCount(): Int {
        return tops.size
    }
}
