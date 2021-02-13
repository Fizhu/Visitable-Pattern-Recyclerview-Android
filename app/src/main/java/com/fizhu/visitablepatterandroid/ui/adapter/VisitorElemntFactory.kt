package com.fizhu.visitablepatterandroid.ui.adapter

import android.view.View
import com.fizhu.visitablepatterandroid.base.AbstractViewHolder
import com.fizhu.visitablepatterandroid.data.Banner
import com.fizhu.visitablepatterandroid.data.Gopay
import com.fizhu.visitablepatterandroid.data.MainMenu
import com.fizhu.visitablepatterandroid.ui.viewholder.BannerViewHolder
import com.fizhu.visitablepatterandroid.ui.viewholder.GopayViewHolder
import com.fizhu.visitablepatterandroid.ui.viewholder.MenuViewHolder

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */
class VisitorElemntFactory(
    private val onClickBanner: (Banner) -> Unit
) : VisitorElement {
    override fun visit(gopay: Gopay): Int = GopayViewHolder.LAYOUT

    override fun visit(mainMenu: MainMenu): Int = MenuViewHolder.LAYOUT

    override fun visit(banner: Banner): Int = BannerViewHolder.LAYOUT

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when (type) {
            GopayViewHolder.LAYOUT -> GopayViewHolder(parent)
            MenuViewHolder.LAYOUT -> MenuViewHolder(parent)
            BannerViewHolder.LAYOUT -> BannerViewHolder(parent, onClickBanner)
            else -> createViewHolder(parent, type)
        }
    }
}