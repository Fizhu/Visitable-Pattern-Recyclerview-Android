package com.fizhu.visitablepatterandroid.ui.adapter

import android.view.View
import com.fizhu.visitablepatterandroid.base.AbstractViewHolder
import com.fizhu.visitablepatterandroid.data.Banner
import com.fizhu.visitablepatterandroid.data.Gopay
import com.fizhu.visitablepatterandroid.data.MainMenu

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */
interface VisitorElement {
    fun visit(gopay: Gopay): Int
    fun visit(mainMenu: MainMenu): Int
    fun visit(banner: Banner): Int
    fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*>
}