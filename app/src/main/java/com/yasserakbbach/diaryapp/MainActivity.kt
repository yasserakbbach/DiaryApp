package com.yasserakbbach.diaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.yasserakbbach.diaryapp.navigation.Screen
import com.yasserakbbach.diaryapp.navigation.SetupNavigationGraph
import com.yasserakbbach.diaryapp.ui.theme.DiaryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            DiaryAppTheme {
                SetupNavigationGraph(
                    startDestination = Screen.Authentication,
                    navController = rememberNavController(),
                )
            }
        }
    }
}