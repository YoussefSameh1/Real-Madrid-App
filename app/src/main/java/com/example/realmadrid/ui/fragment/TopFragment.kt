package com.example.realmadrid.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realmadrid.R
import com.example.realmadrid.data.Player
import com.example.realmadrid.data.Top
import com.example.realmadrid.ui.adapter.TopAdapter

class TopFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_top, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val tops = listOf(
            Top("Most appearances",R.drawable.raul,"Raúl","741"),
            Top("Most goals",R.drawable.ronaldo,"Cristiano Ronaldo","450"),
            Top("Most assists",R.drawable.benzema,"Karim Benzema","165"),
            Top("Most yellow cards",R.drawable.ramos,"Sergio Ramos","202"),
            Top("Most red cards",R.drawable.ramos,"Sergio Ramos","8"),
            Top("Highest transfer fees paid",R.drawable.bellingham,"Jude Bellingham","€103"),
            Top("Highest transfer fees received",R.drawable.ronaldo,"Cristiano Ronaldo","€117")
        )

        val adapter = TopAdapter(tops)
        recyclerView.adapter = adapter

        return view
    }
}