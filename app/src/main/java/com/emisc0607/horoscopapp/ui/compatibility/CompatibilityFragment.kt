package com.emisc0607.horoscopapp.ui.compatibility

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.emisc0607.horoscopapp.R
import com.emisc0607.horoscopapp.databinding.FragmentCompatibilityBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class CompatibilityFragment : Fragment() {
    private lateinit var binding: FragmentCompatibilityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCompatibilityBinding.inflate(inflater, container, false)
        return binding.root
    }
}