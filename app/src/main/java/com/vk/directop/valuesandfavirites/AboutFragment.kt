package com.vk.directop.valuesandfavirites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class AboutFragment : Fragment() {

//    private lateinit var aboutButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

//        aboutButton = view.findViewById(R.id.about_button)
//
//        val aboutFragment = AboutFragment()
//        aboutButton.setOnClickListener {
//
//            activity?.supportFragmentManager
//                ?.beginTransaction()
//                ?.replace(R.id.fragment_container, aboutFragment)
//                ?.commit()
//
//        }

        return view
    }

}