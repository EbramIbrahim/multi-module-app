package com.example.rickmorty.navigation

import kotlinx.serialization.Serializable

sealed interface Screen {

    @Serializable
    data object CharacterDetails: Screen

}