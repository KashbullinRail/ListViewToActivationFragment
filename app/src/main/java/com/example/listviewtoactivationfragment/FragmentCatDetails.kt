package com.example.listviewtoactivationfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.listviewtoactivationfragment.databinding.FragmentCatDetailsBinding
import com.example.listviewtoactivationfragment.databinding.FragmentCatsBinding
import com.example.listviewtoactivationfragment.model.Cat

class FragmentCatDetails : Fragment() {

    private lateinit var binding: FragmentCatDetailsBinding

    private val cat: Cat
        get() = requireArguments().getSerializable(KEY_CAT) as Cat

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatDetailsBinding.inflate(inflater, container, false)
        binding.tvName.text = cat.name
        binding.tvDescription.text = cat.discription

        return binding.root
    }

    companion object {
        private const val KEY_CAT = "KEY_CAT"

        fun newInstance(cat: Cat): FragmentCatDetails {
            val fragment = FragmentCatDetails()
            fragment.arguments = bundleOf(KEY_CAT to cat)
            return fragment
        }
    }


}