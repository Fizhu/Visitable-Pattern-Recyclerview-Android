package com.fizhu.visitablepatterandroid.base

import com.fizhu.visitablepatterandroid.ui.adapter.VisitorElement

/**
 * Created by hafizhanbiya on 13,February,2021
 * https://github.com/Fizhu
 */

abstract class VisitorUIModel {
    abstract fun type(visitorElement: VisitorElement): Int
}