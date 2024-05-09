package com.example.imagepro

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class SignAdapter(private val signList:ArrayList<Sign>) : RecyclerView.Adapter<SignAdapter.SignViewHolder>() {

    class SignViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView : ImageView = itemView.findViewById<ImageView>(R.id.imageView)
        val textView : TextView = itemView.findViewById<TextView>(R.id.textView)
        val textView2 : TextView = itemView.findViewById<TextView>(R.id.textView2)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SignViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return SignViewHolder(view)
    }

    override fun onBindViewHolder(holder: SignViewHolder, position: Int) {
        val sign = signList[position]
        holder.imageView.setImageResource(sign.image)
        holder.textView.text = sign.signName
        holder.textView2.text = sign.signDescription

    }

    override fun getItemCount(): Int {
        return signList.size
    }


}