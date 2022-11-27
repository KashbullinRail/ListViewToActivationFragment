package com.example.listviewtoactivationfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewtoactivationfragment.databinding.FragmentCatsBinding


class FragmentCats : Fragment() {

    private lateinit var binding: FragmentCatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatsBinding.inflate(inflater, container, false)


        val cats = contract().catsService.cats
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, cats)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { _, _, position, _ ->
            val currentCat = adapter.getItem(position)!!
            contract().openCatDetailScreen(currentCat)
        }

        return binding.root
    }

}