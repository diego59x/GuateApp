package com.example.guateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var contador = 0
    var navController: NavController? = null
    private var star: ImageButton? = null
    private var new: String? = null
    private var name: EditText? = null
    private var newname: TextView? = null
    private var guatemala: TextView? = null
    private var tex: TextView? = null
    private var peten: Button? = null
    private var izabal: Button? = null
    private var antigua: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = this.findNavController(R.id.nav_graph)
        NavigationUI.setupActionBarWithNavController(this, navController)
        peten = findViewById(R.id.peten) as Button
        izabal = findViewById(R.id.izabal) as Button
        antigua = findViewById(R.id.antigua) as Button
        star = findViewById(R.id.star) as ImageButton
        name = findViewById(R.id.set_name) as EditText
        newname = findViewById(R.id.textView3) as TextView
        guatemala = findViewById(R.id.Guate) as TextView
        tex = findViewById(R.id.name) as TextView


    }
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.peten -> navController!!.navigate(R.id.action_activity_main_to_peten)
            R.id.antigua -> navController!!.navigate(R.id.action_activity_main_to_antigua)
            R.id.izabal -> navController!!.navigate(R.id.action_activity_main_to_izabal)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_graph)
        return navController.navigateUp()
    }


    fun set(v: View?){
        contador++
        new = name?.text.toString()
        newname?.text  = new
        if(contador%2 != 0){
            newname?.setVisibility(View.VISIBLE)
            name?.setVisibility(View.INVISIBLE)
            guatemala?.setVisibility(View.INVISIBLE)
            tex?.setVisibility(View.INVISIBLE)
        }else{
            newname?.setVisibility(View.INVISIBLE)
            name?.setVisibility(View.VISIBLE)
            guatemala?.setVisibility(View.VISIBLE)
            tex?.setVisibility(View.VISIBLE)
        }
    }



}
