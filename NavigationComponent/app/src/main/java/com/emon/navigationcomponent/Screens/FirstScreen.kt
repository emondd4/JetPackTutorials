package com.emon.navigationcomponent.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.emon.navigationcomponent.Navigation.Screens

@Composable
fun FirstScreen(navController: NavHostController) {

    var text by remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .padding(horizontal = 50.dp)
    ) {
        TextField(value = text, onValueChange = { text = it }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            navController.navigate(Screens.DetailsScreen.withArgs(text))
        }, modifier = Modifier.align(Alignment.End)) {
            Text(text = "To Details Screen")
        }
    }

}