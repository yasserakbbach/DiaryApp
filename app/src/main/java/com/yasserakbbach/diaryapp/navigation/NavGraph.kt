package com.yasserakbbach.diaryapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yasserakbbach.diaryapp.navigation.Routes.WRITE_DIARY_ID_ARG

@Composable
fun SetupNavigationGraph(
    startDestination: Screen,
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination.route,
    ) {
        authenticationRoute()
        homeRoute()
        writeDiaryRoute()
    }
}

private fun NavGraphBuilder.authenticationRoute() {
    composable(route = Screen.Authentication.route) {

    }
}

private fun NavGraphBuilder.homeRoute() {
    composable(route = Screen.Home.route) {

    }
}

private fun NavGraphBuilder.writeDiaryRoute() {
    composable(
        route = Screen.Write.route,
        arguments = listOf(
            navArgument(name = WRITE_DIARY_ID_ARG) {
                type = NavType.StringType
                nullable = true
                defaultValue = null
            }
        )
    ) {

    }
}