package com.example.comic.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.comic.utils.ext.loadImageCircleWithUrl
import com.example.comic.utils.ext.loadImageWithUrl

object BindingUtils {
    @JvmStatic
    @BindingAdapter("app:imageCircleUrl")
    fun setImageCircleUrl(imageView: ImageView, url: String?) {
        url?.let {
            imageView.loadImageCircleWithUrl(it)
        }
    }

    @JvmStatic
    @BindingAdapter("app:imageUrl")
    fun setImageUrl(imageView: ImageView, url: String?) {
        url?.let {
            imageView.loadImageWithUrl(it)
        }
    }
}
