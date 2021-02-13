package com.fizhu.visitablepatterandroid.data

import com.fizhu.visitablepatterandroid.base.VisitorUIModel
import com.fizhu.visitablepatterandroid.ui.adapter.VisitorElement

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

data class Menu(
    val icon: Int,
    val title: String
)

data class MainMenu(
    val menus: List<Menu>
): VisitorUIModel() {
    override fun type(visitorElement: VisitorElement): Int = visitorElement.visit(this)

}