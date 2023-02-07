package com.yasserakbbach.diaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.yasserakbbach.diaryapp.navigation.Screen
import com.yasserakbbach.diaryapp.navigation.SetupNavigationGraph
import com.yasserakbbach.diaryapp.ui.theme.DiaryAppTheme
import com.yasserakbbach.diaryapp.util.Constants.APP_ID
import io.realm.kotlin.mongodb.App

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            DiaryAppTheme {
                SetupNavigationGraph(
                    startDestination = getStartDestination(),
                    navController = rememberNavController(),
                    onDataLoaded = {}
                )
            }
        }
    }

    private fun getStartDestination(): Screen =
        App.create(APP_ID).currentUser?.run {
            if(loggedIn) Screen.Home
            else Screen.Authentication
        } ?: Screen.Authentication
}