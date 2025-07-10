package com.example.rickmorty.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.network.models.domain.CharacterStatus
import com.example.rickmorty.presentation.component.common.CharacterNameComponent

@Composable
fun CharacterDetailsNamePlateComponent(
    name: String,
    status: CharacterStatus
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        CharacterStatusComponent(characterStatus = status)
        CharacterNameComponent(name)
    }
}