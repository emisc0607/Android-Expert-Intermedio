package com.emisc0607.horoscopapp.ui.compatibility

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.ListFragment
import androidx.fragment.app.viewModels
import com.emisc0607.horoscopapp.R
import com.emisc0607.horoscopapp.databinding.FragmentCompatibilityBinding
import com.emisc0607.horoscopapp.ui.list.ListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CompatibilityFragment : Fragment() {
    private val viewModel by viewModels<CompatibilityViewModel>()
    private lateinit var binding: FragmentCompatibilityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCompatibilityBinding.inflate(inflater, container, false)
        return binding.root
    }
}