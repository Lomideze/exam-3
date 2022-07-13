package com.example.exam3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam3.databinding.CustomItemBinding

class ItemAdapter(val items: MutableList<ItemData>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(CustomItemBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = items.size

    inner class ItemViewHolder(val binding: CustomItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private lateinit var item: ItemData

        fun bind() {
            item = items[adapterPosition]

            binding.apply {
                ivItem2.setImageResource(item.iconImage)
                ivItem.setImageResource(item.userImage)
                tvItem.text = item.title
                tvLanguage.text = item.language
            }
        }
    }
}