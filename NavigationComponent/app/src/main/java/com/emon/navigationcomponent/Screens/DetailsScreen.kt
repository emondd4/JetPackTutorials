package com.emon.navigationcomponent.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun DetailsScreen(navController: NavHostController,name: String?) {

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxHeight()) {
        Text(text = "Hello, $name")
    }

}