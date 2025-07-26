package com.example.rickmorty.presentation.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.network.models.domain.Character
import com.example.rickmorty.presentation.component.common.CharacterImage
import com.example.rickmorty.presentation.component.common.CharacterNameComponent

@Composable
fun CharacterEpisodeScreen(characterId: Int) {

}


@Composable
private fun MainScreen(character: Character) {

    LazyColumn(
        contentPadding = PaddingValues(16.dp)
    ) {
        item { CharacterNameComponent(character.name) }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { CharacterImage(character.imageUrl) }
    }
}










