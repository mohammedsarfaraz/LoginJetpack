package com.example.loginscreen

import android.app.Application
import androidx.lifecycle.AndroidViewModel

 class AndroidViewModel(application: Application):AndroidViewModel(application){

     val graph1 = floatArrayOf(
         0f, 33000f, 188000f, 695000f, 324000f, 230000f, 188000f, 15000f, 126000f, 5000f, 33000f
     )
     val graph2 = floatArrayOf(
         100000f, 245000f, 101100f, 1000f, 0f, 0f, 47000f, 20000f, 12000f, 124400f, 160000f
     )
     val legendArr = listOf("05/21", "05/22", "05/23", "05/24", "05/25", "05/26", "05/27", "05/28", "05/29", "05/30", "05/31")

 }