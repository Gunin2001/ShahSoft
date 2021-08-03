package com.example.shahsoft

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RvAdapter(val crops: ArrayList<Crop> = ArrayList<Crop>() ): RecyclerView.Adapter<RvAdapter.RvViewHolder>() {
    class RvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        return RvViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent , false))
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.itemView.txtShowTitle.text = crops[position].CropName
        holder.itemView.txtShowDate.text= crops[position].Place
        holder.itemView.txtShowTime.text=crops[position].Time.toString()

    }

    override fun getItemCount(): Int = crops.size
}