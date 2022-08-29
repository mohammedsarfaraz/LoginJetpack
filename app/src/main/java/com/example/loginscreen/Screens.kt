package com.example.loginscreen

sealed class Screens(val route : String){

    object mainactivity:Screens(route = "mainScreen")
    object Dashboard:Screens(route = "Dashboard")

}
