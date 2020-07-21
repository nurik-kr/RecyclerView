package com.example.receclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

private var RecyclerviewHorizontal: RecyclerView? = null
private var RecyclerviewVertical: RecyclerView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RecyclerviewHorizontal = findViewById(R.id.RecyclerviewHorizontal)
        RecyclerviewVertical = findViewById(R.id.RecyclerviewVertical)

        val list = arrayListOf<String>()
        for (i in 1..10) {
            list.add("mers $i")
        }
        val adapter = HorizontalAdapter(list)
        RecyclerviewHorizontal?.adapter = adapter

        val list2 = arrayListOf<DataClass>()
        for (n in 1..10) {
            list2.add(
                DataClass("124 $n", "and", "E34 $n", R.drawable.mers_bmw))
        }
        val adapter2 = VerticalAdapter(list2)
        RecyclerviewVertical?.adapter = adapter2
    }
}