package com.fizhu.visitablepatterandroid.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.GridLayoutManager
import com.fizhu.visitablepatterandroid.R
import com.fizhu.visitablepatterandroid.base.AbstractViewHolder
import com.fizhu.visitablepatterandroid.data.MainMenu
import com.fizhu.visitablepatterandroid.databinding.ItemMainMenuBinding
import com.fizhu.visitablepatterandroid.ui.MainMenuAdapter

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

class MenuViewHolder(
    view: View,
) : AbstractViewHolder<MainMenu>(view) {
    private val binding = ItemMainMenuBinding.bind(view)
    private lateinit var mainMenuAdapter: MainMenuAdapter

    override fun bind(element: MainMenu) {
        if (!::mainMenuAdapter.isInitialized && element.menus.isNotEmpty()) {
            mainMenuAdapter = MainMenuAdapter(element.menus)
        }

        binding.rvMenu.layoutManager = GridLayoutManager(binding.root.context, 3)
        binding.rvMenu.adapter = mainMenuAdapter
    }

    companion object {
        @LayoutRes
        const val LAYOUT = R.layout.item_main_menu
    }

}