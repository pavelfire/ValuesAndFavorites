package com.vk.directop.valuesandfavirites

import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(itemModel: ItemModel){
        val name: TextView = itemView.findViewById(R.id.tv_name)
        val aNumber: TextView = itemView.findViewById(R.id.tv_a_number)


        name.text = itemModel.name
        aNumber.text = itemModel.aNumber.toString()

        val itemLayout: ConstraintLayout = itemView.findViewById(R.id.item_layout)
        itemLayout.setOnClickListener {
            Toast.makeText(itemView.context,
                " $name : $aNumber",
                Toast.LENGTH_LONG).show()

            Log.d("MyTag", "Pressed $name")
        }
    }
}