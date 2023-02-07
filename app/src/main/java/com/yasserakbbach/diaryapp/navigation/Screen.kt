package com.yasserakbbach.diaryapp.navigation

import com.yasserakbbach.diaryapp.navigation.Routes.WRITE_DIARY_ID_ARG

sealed class Screen(val route: String) {
    object Authentication : Screen(Routes.AUTHENTICATION)
    object Home : Screen(Routes.HOME)
    object Write : Screen(Routes.WRITE) {
        fun passDiaryId(id: String?): String =
            Routes.WRITE.replace("{$WRITE_DIARY_ID_ARG}", id ?: "null")
    }
}
