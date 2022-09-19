package com.example.rickandmorty.ui.fragment.main



import androidx.lifecycle.lifecycleScope

import com.example.rickandmorty.databinding.FragmentMainBinding

import com.example.rickandmorty.ui.fragment.main.adapter.Adapter
import com.example.rickandmorty.utils.base.ui.fragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment(private var adapter: Adapter) : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    @Inject
    var viewModel: MainViewModel? = null
    override fun setupUI() {
        initViewModel()
    }

    private fun initViewModel() {
        viewModel?.getCharacter()
        initAdapter()
    }

    private fun initAdapter() {
        adapter = Adapter()
        binding().rvRc.adapter = adapter
    }

    override fun setupObserver() {
          getCharacter()
    }

    private fun getCharacter() {
        lifecycleScope.launch {
            viewModel?.getData()?.collect{
                adapter.setList(it.)
            }
        }
    }

}

