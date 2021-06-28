package com.example.comic.utils.ext

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.comic.R

fun ImageView.loadImageWithUrl(url: String) {
    Glide.with(this)
            .load(url)
            .transition(DrawableTransitionOptions.withCrossFade())
            .placeholder(R.drawable.img_default)
            .into(this)
}

fun ImageView.loadImageCircleWithUrl(url: String) {
    Glide.with(this)
            .load(url)
            .circleCrop()
            .transition(DrawableTransitionOptions.withCrossFade())
            .placeholder(R.drawable.img_circle_default)
            .into(this)
}
