package com.example.rickmorty.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rickmorty.presentation.ui.CharacterDetailsScreen


@Composable
fun SetUpNavHost() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.CharacterDetails
    ) {
        composable<Screen.CharacterDetails> {
            CharacterDetailsScreen()
        }
    }

}