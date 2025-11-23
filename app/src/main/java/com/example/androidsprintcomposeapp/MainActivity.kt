package com.example.androidsprintcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            println("setContent")
            BananaText()
        }
    }
}

@Composable
fun BananaText(){
    println("Banana button starts")

    var count by remember {
        println("remember")
        mutableStateOf(0)
    }

    println("Count is declared")

    Text(
        "Banana text is: ${count}",
        modifier = Modifier.clickable{
            count++
        },
        style = TextStyle(fontSize = 50.sp)
    )

    val appleCount = count.toString()
    AppleText(text = appleCount)

}

@Composable
fun AppleText(text: String){
    println("Apple text is: $text")
    Text(
        "Apple text is: ${text}",
        style = TextStyle(fontSize = 44.sp)
    )
}