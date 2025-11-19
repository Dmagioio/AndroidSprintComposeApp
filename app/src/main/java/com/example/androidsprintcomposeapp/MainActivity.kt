package com.example.androidsprintcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidsprintcomposeapp.ui.theme.mainBlackColor
import com.example.androidsprintcomposeapp.ui.theme.subtitleGrayColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                content = { innerPadding: PaddingValues ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(Color.LightGray)
                            .fillMaxSize()
                        ,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        StudyAppHeader()
                        Spacer(modifier = Modifier.height(30.dp))
                        MainNavButtons()
                    }
                }
            )
        }
    }
}
@Composable
fun StudyAppHeader() {
    Column {
        Text(
            text = "Android text",
            fontSize = 28.sp,
        )
        Text(
            text = "Android Spring",
            fontSize = 18.sp,
        )
    }
}

@Composable
fun MainNavButtons(){
    Row {
        Button(onClick = {}) {
            Text("Home")
        }
        Button(onClick = {}) {
            Text("Login")
        }
        Button(onClick = {}) {
            Text("Register")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StudyAppHeaderPreview(){
    StudyAppHeader()
}

@Preview(showBackground = true)
@Composable
private fun MainNavButtonsPreview(){
    MainNavButtons()
}