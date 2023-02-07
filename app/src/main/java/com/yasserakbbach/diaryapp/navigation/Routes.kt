package com.yasserakbbach.diaryapp.navigation

object Routes {
    const val AUTHENTICATION = "authentication_screen"
    const val HOME = "home_screen"
    const val WRITE_DIARY_ID_ARG = "diaryId"
    const val WRITE = "write_screen?$WRITE_DIARY_ID_ARG={$WRITE_DIARY_ID_ARG}"
}