package com.jaime.shopplatzi

import android.app.Activity
import android.widget.Toast


fun Activity.toastShort(mensaje: String){

    Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
}