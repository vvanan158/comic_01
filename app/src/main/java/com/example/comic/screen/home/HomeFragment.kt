package com.example.comic.screen.home

import android.view.LayoutInflater
import com.example.comic.databinding.HomeFragmentBinding
import com.example.comic.utils.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeFragmentBinding,HomeViewModel>() {

    override val viewModel: HomeViewModel by viewModel()

    override fun inflateViewBinding(inflater: LayoutInflater) =HomeFragmentBinding.inflate(inflater)

    override fun setUpView() {
    }

    override fun bindView() {
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}
