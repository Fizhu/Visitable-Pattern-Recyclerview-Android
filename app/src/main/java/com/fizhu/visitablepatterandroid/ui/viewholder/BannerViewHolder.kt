package com.fizhu.visitablepatterandroid.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import com.fizhu.visitablepatterandroid.R
import com.fizhu.visitablepatterandroid.base.AbstractViewHolder
import com.fizhu.visitablepatterandroid.data.Banner
import com.fizhu.visitablepatterandroid.data.Gopay
import com.fizhu.visitablepatterandroid.databinding.ItemBannerBinding
import com.fizhu.visitablepatterandroid.databinding.ItemGopayBinding

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

class BannerViewHolder(
    view: View,
    private val onClick: (Banner) -> Unit
) : AbstractViewHolder<Banner>(view) {
    private val binding = ItemBannerBinding.bind(view)

    override fun bind(element: Banner) {
        binding.root.setOnClickListener { onClick.invoke(element) }
    }

    companion object {
        @LayoutRes
        const val LAYOUT = R.layout.item_banner
    }

}