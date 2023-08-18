package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myrecyclerview.databinding.ActivityMainBinding
import com.example.myrecyclerview.databinding.ItemBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)


        list = ArrayList()
        list.add(Info(R.drawable.titanic,"Titanic"))
        list.add(Info(R.drawable.lalaland,"La La Land"))
        list.add(Info(R.drawable.lotr, "Lord Of The Rings"))
        list.add(Info(R.drawable.leon, "Leon"))
        list.add(Info(R.drawable.scream, "Scream"))
        list.add(Info(R.drawable.sixthsense, "Sixth Sense"))
        list.add(Info(R.drawable.tenthingsihate, "10 Things I Hate About You"))
        list.add(Info(R.drawable.fightclub,"Fight Club"))


        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL)


    }
}