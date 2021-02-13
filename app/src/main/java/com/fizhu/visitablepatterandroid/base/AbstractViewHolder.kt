package com.fizhu.visitablepatterandroid.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

abstract class AbstractViewHolder<in T>(
    private val view: View
): RecyclerView.ViewHolder(view) {

    abstract fun bind(element: T)

}