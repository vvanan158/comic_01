package com.example.comic.screen.container

import android.view.LayoutInflater
import androidx.viewpager.widget.ViewPager
import com.example.comic.R
import com.example.comic.databinding.FragmentContainerBinding
import com.example.comic.screen.container.adapter.PagerAdapter
import com.example.comic.screen.home.HomeFragment
import com.example.comic.screen.me.MeFragment
import com.example.comic.utils.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class ContainerFragment : BaseFragment<FragmentContainerBinding, ContainerViewModel>() {

    private var adapter: PagerAdapter? = null

    override val viewModel: ContainerViewModel by viewModel()

    override fun inflateViewBinding(inflater: LayoutInflater) =
        FragmentContainerBinding.inflate(inflater)

    override fun setUpView() {
        viewBinding.lifecycleOwner = this.viewLifecycleOwner
        viewBinding.viewModel = viewModel
    }

    override fun bindView() {
        adapter = PagerAdapter(childFragmentManager).apply {
            addFragment(HomeFragment.newInstance())
            addFragment(MeFragment.newInstance())
        }
        viewBinding.run {
            containerViewPager.adapter = adapter
            containerViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) = Unit

                override fun onPageSelected(position: Int) {
                    viewBinding.bottomNavigationView.selectedItemId =
                        viewBinding.bottomNavigationView.menu.getItem(position).itemId
                }

                override fun onPageScrollStateChanged(state: Int) = Unit
            })
            bottomNavigationView.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.item_menu_nav_home -> {
                        containerViewPager.currentItem = TypeMenu.HOME.ordinal
                        true
                    }
                    R.id.item_menu_nav_me -> {
                        containerViewPager.currentItem = TypeMenu.ME.ordinal
                        true
                    }
                    else -> false
                }
            }
        }
    }

    companion object {
        fun newInstance() = ContainerFragment()
    }
}
