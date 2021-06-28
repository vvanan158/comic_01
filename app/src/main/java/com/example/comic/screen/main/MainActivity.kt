package com.example.comic.screen.main

import android.view.LayoutInflater
import com.example.comic.R
import com.example.comic.databinding.ActivityMainBinding
import com.example.comic.screen.container.ContainerFragment
import com.example.comic.utils.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModel()

    override fun inflateViewBinding(inflater: LayoutInflater) =
        ActivityMainBinding.inflate(inflater)

    override fun initView() {
        viewBinding.lifecycleOwner = this
        viewBinding.viewModel = viewModel

        supportFragmentManager
            .beginTransaction()
            .addToBackStack(ContainerFragment::javaClass.name)
            .replace(R.id.containerView, ContainerFragment.newInstance())
            .commit()
    }

    override fun initData() {}
}
