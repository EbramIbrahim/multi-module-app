package com.example.network.models.domain

import androidx.compose.ui.graphics.Color

sealed class CharacterStatus(val displayName: String) {
    object Alive : CharacterStatus("Alive")
    object Dead : CharacterStatus("Dead")
    object Unknown : CharacterStatus("Unknown")
}

fun CharacterStatus.asColor(): Color {
    return when (displayName) {
        "Alive" -> Color.Green
        "Dead" -> Color.Red
        else -> Color.Gray
    }
}