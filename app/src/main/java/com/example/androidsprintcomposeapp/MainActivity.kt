package com.example.androidsprintcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
//                            .background(Color.LightGray)
                            .fillMaxSize()
                        ,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        StudyAppHeader()
                        Spacer(modifier = Modifier.height(30.dp))
                        MainNavButtons()
                        Spacer(modifier = Modifier.height(30.dp))
                        StartImageButton()
                    }
                }
            )
        }
    }
}
@Composable
fun StudyAppHeader() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Android text",
            fontSize = 28.sp,
            color = mainBlackColor,
            fontFamily = FontFamily(Font(R.font.roboto_condensed_black)),
        )
        Text(
            text = "Android JetPack Compose learn",
            fontSize = 18.sp,
            color = subtitleGrayColor,
            fontFamily = FontFamily(Font(R.font.roboto_condensed_italic)),
        )
    }
}

@Composable
fun MainNavButtons(){
    Row {
        Button(
            onClick = {},
            shape = RoundedCornerShape(13.dp),
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 5.dp)
        ) {
            Text(
                "Home",
                fontFamily = FontFamily(Font(R.font.roboto_condensed_italic)),
                )
        }
        Button(
            onClick = {},
            shape = RoundedCornerShape(13.dp),
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 5.dp)
        ) {
            Text(
                "Login",
                fontFamily = FontFamily(Font(R.font.roboto_condensed_italic)),
                )
        }
        Button(
            onClick = {},
            shape = RoundedCornerShape(13.dp),
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 5.dp)
        ) {
            Text(
                "Register",
                fontFamily = FontFamily(Font(R.font.roboto_condensed_italic)),
                )
        }
    }
}

@Composable
fun StartImageButton(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.rocket),
            contentDescription = "",
            modifier = Modifier
                .size(140.dp)
                .shadow(3.dp, CircleShape)
                .clip(CircleShape)
                .clickable(
                    onClick = {}
                )
        )
        Text(
            text = "Rocket flight",
            fontSize = 15.sp,
            color = mainBlackColor,
            fontFamily = FontFamily(Font(R.font.roboto_condensed_black)),
        )
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

@Preview(showBackground = true)
@Composable
private fun StartImageButtonPreview(){
    StartImageButton()
}
