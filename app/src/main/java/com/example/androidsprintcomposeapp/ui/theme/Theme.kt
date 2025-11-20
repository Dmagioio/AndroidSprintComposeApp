package com.example.androidsprintcomposeapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidsprintcomposeapp.R

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    headlineLarge = TextStyle(
        fontSize = 28.sp,
        fontFamily = FontFamily(Font(R.font.roboto_condensed_black)),
    ),
    headlineMedium = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily(Font(R.font.roboto_condensed_italic)),
    )
)
private val DarkColorScheme = darkColorScheme(
    primary = mainTitleColorDark,
    secondary = PurpleGrey80,
    tertiary = Pink80,

    background = backgroundDark,
    surface = backgroundDark,
    onBackground = mainTitleColorDark,

    )

private val LightColorScheme = lightColorScheme(
    primary = mainTitleColor,
    secondary = PurpleGrey40,
    tertiary = Pink40,

    background = background,
    surface = background,
    onBackground = mainTitleColor,

/* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

val ColorScheme.subtitle: Color
    @Composable
    get() = if (isSystemInDarkTheme()) subtitleGrayColorDark else subtitleGrayColor
@Composable
fun AndroidSprintComposeAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}
