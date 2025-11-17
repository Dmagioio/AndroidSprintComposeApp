package com.example.androidsprintcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Scaffold { padding: PaddingValues ->
                StudyAppHeader(padding)
            }
        }
    }
}
@Composable
fun StudyAppHeader(padding: PaddingValues) {
    Text(
        text = "Android text",
        modifier = Modifier.padding(padding),
        fontSize = 28.sp
    )
}

@Preview(showBackground = true)
@Composable
private fun StudyAppHeaderPreview(){
    StudyAppHeader(padding = PaddingValues())
}
