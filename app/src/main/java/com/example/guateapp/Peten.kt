package com.example.guateapp

import android.app.Fragment
import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.findFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.guateapp.R

class Peten : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peten, container, false)
    }


}