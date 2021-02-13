package com.fizhu.visitablepatterandroid.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fizhu.visitablepatterandroid.R
import com.fizhu.visitablepatterandroid.data.Menu
import com.fizhu.visitablepatterandroid.databinding.ItemMenuBinding

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

class MainMenuAdapter constructor(
    private val items: List<Menu> = arrayListOf()
) : RecyclerView.Adapter<MainMenuAdapter.MainMenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMenuViewHolder {
        val layoutInflater = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return MainMenuViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MainMenuViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemCount() = items.size

    inner class MainMenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = ItemMenuBinding.bind(view)
        fun onBind(menu: Menu) {
            binding.tv.text = menu.title
        }

    }

}