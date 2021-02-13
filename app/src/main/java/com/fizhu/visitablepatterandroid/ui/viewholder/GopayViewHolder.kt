package com.fizhu.visitablepatterandroid.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import com.fizhu.visitablepatterandroid.R
import com.fizhu.visitablepatterandroid.base.AbstractViewHolder
import com.fizhu.visitablepatterandroid.data.Gopay
import com.fizhu.visitablepatterandroid.databinding.ItemGopayBinding

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

class GopayViewHolder(
    view: View,
) : AbstractViewHolder<Gopay>(view) {
    private val binding = ItemGopayBinding.bind(view)

    override fun bind(element: Gopay) {
        binding.tvAmount.text = "Rp ${element.amount},-"
    }

    companion object {
        @LayoutRes
        const val LAYOUT = R.layout.item_gopay
    }

}