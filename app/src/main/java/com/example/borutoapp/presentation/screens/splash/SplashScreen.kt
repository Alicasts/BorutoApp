package com.example.borutoapp.presentation.screens.splash

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.borutoapp.R
import com.example.borutoapp.ui.theme.Purple500
import com.example.borutoapp.ui.theme.Purple700

@Composable
fun SplashScreen(navController: NavHostController) {
    Splash()
}

@Composable
fun Splash() {
    val isSystemInDarkTheme = isSystemInDarkTheme()
    val topColor = if (isSystemInDarkTheme) Color.Black else Purple700
    val bottomColor = if (isSystemInDarkTheme) Color.Black else Purple500
    Box(
        modifier = Modifier
            .background(Brush.verticalGradient(listOf(topColor, bottomColor)))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = stringResource(R.string.app_logo)
        )

    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    Splash()
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SplashScreenDarkPreview() {
    Splash()
}