package com.example.realmadrid.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realmadrid.R
import com.example.realmadrid.data.Player
import com.example.realmadrid.ui.DetailsActivity
import com.example.realmadrid.ui.adapter.ListAdapter

class SquadFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_squad, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val players = listOf(
            Player("Thibaut Courtois",32,"Goalkeeper",1,"Belgium","2.00 m",R.drawable.courtois),
            Player("Andriy Lunin",25,"Goalkeeper",13,"Ukraine","1.92 m",R.drawable.lunin),
            Player("Daniel Carvajal",32,"Right-Back",2,"Spain","1.73 m",R.drawable.carvajal),
            Player("Éder Militão",26,"Centre-Back",3,"Brazil","1.86 m",R.drawable.militao),
            Player("David Alaba",32,"Centre-Back",4,"Austria","1.80 m",R.drawable.alaba),
            Player("Lucas Vázquez",33,"Right-Back",17,"Spain","1.73 m",R.drawable.vazquez),
            Player("Jesús Vallejo",27,"Centre-Back",18,"Spain","1.84 m",R.drawable.vallejo),
            Player("Fran García",25,"Left-Back",20,"Spain","1.69 m",R.drawable.garcia),
            Player("Antonio Rüdiger",31,"Centre-Back",22,"Germany","1.90 m",R.drawable.rudiger),
            Player("Ferland Mendy",29,"Left-Back",23,"France","1.00 m",R.drawable.mendy),
            Player("Jude Bellingham",21,"Attacking Midfield",5,"England","1.86 m",R.drawable.bellingham),
            Player("Eduardo Camavinga",21,"Central Midfield",6,"France","1.85 m",R.drawable.camavinga),
            Player("Federico Valverde",26,"Central Midfield",8,"Uruguay","1.82 m",R.drawable.valverde),
            Player("Luka Modric",39,"Central Midfield",10,"Croatia","1.72 m",R.drawable.modric),
            Player("Aurélien Tchouaméni",24,"Defensive Midfield",14,"France","1.87 m",R.drawable.tchouameni),
            Player("Arda Güler",19,"Right Winger",15,"Turkey","1.75 m",R.drawable.guler),
            Player("Dani Ceballos",28,"Central Midfield",19,"Spain","1.79 m",R.drawable.ceballos),
            Player("Vinicius Junior",24,"Left Winger",7,"Brazil","1.76 m",R.drawable.junior),
            Player("Kylian Mbappé",25,"Centre-Forward",9,"France","1.78 m",R.drawable.mbappe),
            Player("Rodrygo",23,"Right Winger",11,"Brazil","1.74 m",R.drawable.rodrygo),
            Player("Endrick",18,"Centre-Forward",16,"Brazil","1.73 m",R.drawable.endrick),
            Player("Brahim Díaz",25,"Attacking Midfield",21,"Morocco","1.70 m",R.drawable.brahim)
            )

        recyclerView.adapter = ListAdapter(players) { player ->
            val intent = Intent(requireActivity(), DetailsActivity::class.java).apply {
                putExtra("name", player.name)
                putExtra("age", player.age)
                putExtra("position", player.position)
                putExtra("kitNumber", player.kitNumber)
                putExtra("nationality", player.nationality)
                putExtra("height", player.height)
                putExtra("image", player.image)
            }
            startActivity(intent)
        }

        return view
    }
}