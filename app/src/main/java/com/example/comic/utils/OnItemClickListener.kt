package com.example.comic.utils

import com.example.comic.utils.Constant.POSITION_DEFAULT

interface OnItemClickListener<T> {
    fun onItemViewClick(item: T, position: Int = POSITION_DEFAULT)
}
