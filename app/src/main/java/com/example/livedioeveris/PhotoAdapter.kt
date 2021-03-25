package com.example.livedioeveris

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhotoAdapter(var context : Context): RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    var dataList = emptyList<MenuItemModel>()

    internal fun setDataList(dataList : List<MenuItemModel>){
        this.dataList = dataList
    }

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var titulo : TextView
        var image : ImageView
        init{
            titulo = itemView.findViewById(R.id.tv_title)
            image = itemView.findViewById(R.id.p_cartao)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = dataList.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = dataList[position]
        holder.titulo.text = data.titulo
        holder.image.setImageResource(data.image)
    }
}