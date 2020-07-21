package com.example.receclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vertical.view.*

class VerticalAdapter(private var array2:ArrayList<DataClass>):RecyclerView.Adapter<ViewHolder2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder2 {
        val view2 = LayoutInflater.from(parent.context).inflate(R.layout.vertical,parent,false)
        val holder = ViewHolder2(view2)
        return holder
    }

    override fun getItemCount() = array2.size

    override fun onBindViewHolder(holder2: ViewHolder2, position: Int) {
        val random = array2[position]
        holder2.bind(random)
    }
}

class ViewHolder2(view2 : View):RecyclerView.ViewHolder(view2){
    fun bind(itemview:DataClass){
        itemView.text1.text = itemview.text1
        itemView.text2.text = itemview.text2
        itemView.text3.text = itemview.text3
        itemView.imageTwo.setImageResource(itemview.imageTwo)
    }
}