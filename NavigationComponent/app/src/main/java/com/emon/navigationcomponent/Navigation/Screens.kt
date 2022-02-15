package com.emon.navigationcomponent.Navigation

sealed class Screens(val route: String){
    object FirstScreen: Screens("first_screen")
    object DetailsScreen: Screens("details_screen")

    fun withArgs(vararg args: String): String{
        return  buildString {
            append(route)
            args.forEach {
                append("/$it")
            }
        }
    }

}
