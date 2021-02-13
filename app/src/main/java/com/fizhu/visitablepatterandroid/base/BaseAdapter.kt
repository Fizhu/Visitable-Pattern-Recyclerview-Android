package com.fizhu.visitablepatterandroid.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fizhu.visitablepatterandroid.ui.adapter.VisitorElement

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

class BaseAdapter constructor(
    private val viewtypeElement: VisitorElement,
    private val items: ArrayList<VisitorUIModel> = arrayListOf()
) : RecyclerView.Adapter<AbstractViewHolder<VisitorUIModel>>() {

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AbstractViewHolder<VisitorUIModel> {
        val layoutView = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return viewtypeElement.createViewHolder(
            layoutView,
            viewType
        ) as AbstractViewHolder<VisitorUIModel>
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<VisitorUIModel>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = items[position].type(viewtypeElement)

    fun addItem(item: VisitorUIModel) {
        this.items.add(item)
        notifyDataSetChanged()
    }

    fun addItems(items: List<VisitorUIModel>) {
        this.items.addAll(items)
        notifyDataSetChanged()
    }


}