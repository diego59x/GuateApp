package com.example.guateapp


import android.app.AppComponentFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import com.example.guateapp.R
import kotlinx.android.synthetic.*

class Izabal : Fragment(),  View.OnClickListener {

    private var enviar: Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

       
        return inflater.inflate(R.layout.fragment_izabal, container, false)
    }
    // send message
    override fun onClick(p0: View?) {
        enviar = findViewById(R.id.enviar) as Button

    }
}
