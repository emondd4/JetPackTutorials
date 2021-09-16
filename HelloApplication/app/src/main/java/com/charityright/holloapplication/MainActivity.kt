package com.charityright.holloapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.cardview.widget.CardView
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.charityright.holloapplication.ui.theme.HolloApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Greeting(name = "Emon Hossain")
            CardView()
        }
    }
}

@Composable
fun CardView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
            .border(width = 1.dp, color = Color.Gray)
            .padding(12.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.dummy_image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Column {
            Text(text = "Hello This Is Just An Example Text and I will be developing application on jetpack compose soom.")
            Button(onClick = {

            }) {
                Text(text = "View Profile")
            }

        }
    }
}

@Composable
fun Greeting(name: String) {

    val context = LocalContext.current

    Text(
        text = "Hello $name!",
        fontSize = 32.sp,
        fontFamily = FontFamily.Monospace,
        modifier = Modifier.clickable {
            Toast.makeText(context, "Clicked Item", Toast.LENGTH_SHORT).show()
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HolloApplicationTheme {
//        Surface(modifier = Modifier.fillMaxSize()) {
//        }
//        Greeting("Android")
        CardView()
    }
}