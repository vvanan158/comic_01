package com.example.comic.screen.me

import android.view.LayoutInflater
import com.example.comic.databinding.MeFragmentBinding
import com.example.comic.utils.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MeFragment : BaseFragment<MeFragmentBinding, MeViewModel>() {

    override val viewModel: MeViewModel by viewModel()

    override fun inflateViewBinding(inflater: LayoutInflater) = MeFragmentBinding.inflate(inflater)

    override fun setUpView() {
    }

    override fun bindView() {
    }

    companion object {
        fun newInstance() = MeFragment()
    }
}
