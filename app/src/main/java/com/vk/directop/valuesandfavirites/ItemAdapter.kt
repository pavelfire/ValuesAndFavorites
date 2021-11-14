package com.vk.directop.valuesandfavirites

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemsList: List<ItemModel>) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemListView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.my_item, parent, false)
        return ItemViewHolder(itemListView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemModel = itemsList[position]
        holder.bind(itemModel)
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}