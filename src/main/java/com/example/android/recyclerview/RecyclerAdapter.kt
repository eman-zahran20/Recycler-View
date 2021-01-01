package com.example.android.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var names = arrayOf("The University of Jordan","The Hashemite University","Mutah University","Al-Balqa' Applied University",
        "Yarmouk University","Al Abayt University","Al-Hussein Bin Talal University","JUST")

    private var addresses = arrayOf("Amman","Al-Zarqa","Al-Karak","Al-Salt","Irbid","Al-Mafraq","Ma'an","Irbid")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemName.text=names[position]
        holder.itemAddress.text=addresses[position]
    }



    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemName: TextView
        var itemAddress: TextView

        init {
            itemName = itemView.findViewById(R.id.item_name)
            itemAddress = itemView.findViewById(R.id.item_address)

            itemView.setOnClickListener {
                val position: Int = adapterPosition

                Toast.makeText(itemView.context, "you clicked on ${names[position]}" , Toast.LENGTH_LONG).show()
            }
        }
    }
}