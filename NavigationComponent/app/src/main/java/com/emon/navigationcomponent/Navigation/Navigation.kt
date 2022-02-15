package com.emon.navigationcomponent.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.emon.navigationcomponent.Screens.DetailsScreen
import com.emon.navigationcomponent.Screens.FirstScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.FirstScreen.route) {
        composable(route = Screens.FirstScreen.route) {
            FirstScreen(navController = navController)
        }
        composable(
            route = Screens.DetailsScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                type = NavType.StringType
                defaultValue = "Default Value"
                nullable = true
            })
        ) {
            DetailsScreen(navController = navController, name = it.arguments?.getString("name"))
        }
    }
}