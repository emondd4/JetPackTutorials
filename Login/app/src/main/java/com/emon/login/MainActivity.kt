package com.emon.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.emon.login.ui.theme.LoginTheme
import com.emon.login.view.LoginPage
import com.emon.login.view.Registration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NavigatePage()
                }
            }
        }
    }
}

@Composable
fun NavigatePage() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login_page",
        builder = {
            composable("login_page", content = { LoginPage() })
            composable("register_page", content = { Registration(navController = navController) })
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginTheme {
        NavigatePage()
    }
}