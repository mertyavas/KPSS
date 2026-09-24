package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimary,
    onPrimary = DarkBackground,
    primaryContainer = NavyPrimary,
    onPrimaryContainer = Color.White,
    secondary = DarkSecondary,
    onSecondary = DarkBackground,
    secondaryContainer = TealDark,
    onSecondaryContainer = TealLight,
    tertiary = DarkTertiary,
    onTertiary = DarkBackground,
    tertiaryContainer = AmberDark,
    onTertiaryContainer = AmberLight,
    background = DarkBackground,
    onBackground = Slate50,
    surface = DarkSurface,
    onSurface = Slate50,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = Slate200,
    error = CrimsonError,
    onError = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = NavyPrimary,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFDBEAFE),
    onPrimaryContainer = NavyDark,
    secondary = TealSecondary,
    onSecondary = Color.White,
    secondaryContainer = TealLight,
    onSecondaryContainer = TealDark,
    tertiary = AmberAccent,
    onTertiary = Color.White,
    tertiaryContainer = AmberLight,
    onTertiaryContainer = AmberDark,
    background = Slate50,
    onBackground = Slate900,
    surface = Color.White,
    onSurface = Slate900,
    surfaceVariant = Slate100,
    onSurfaceVariant = Slate700,
    error = CrimsonError,
    onError = Color.White
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Use our handcrafted cohesive educational palette
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
        typography = Typography,
        content = content
    )
}
