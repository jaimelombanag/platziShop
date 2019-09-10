package com.jaime.shopplatzi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //textview.text = "Jaime Andres Lombana Gonzalez"

        //toastShort("Te amo claudia Fonseca")
        toast("Te amo Claudia Fonseca desde Anko")


        //textview.setOnClickListener{
        //    startActivity<DetailActivity>("text" to "Valerie Lombana")
        //}


    }
}
