package com.example.rickmorty.presentation.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.network.models.domain.Character
import com.example.network.models.domain.Episode
import com.example.rickmorty.presentation.component.common.CharacterImage
import com.example.rickmorty.presentation.component.common.CharacterNameComponent
import com.example.rickmorty.presentation.component.episode.EpisodeRowComponent
import com.example.rickmorty.ui.theme.RickTextPrimary

@Composable
fun CharacterEpisodeScreen(characterId: Int) {

}


@Composable
private fun MainScreen(character: Character, episode: List<Episode>) {

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
    ) {
        item { CharacterNameComponent(character.name) }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { CharacterImage(character.imageUrl) }
        item { Spacer(modifier = Modifier.height(32.dp)) }

        episode.groupBy { it.seasonNumber }.forEach { mapEntry ->

            item { SeasonHeader(mapEntry.key) }
            item { Spacer(modifier = Modifier.height(16.dp)) }

            items(mapEntry.value) {
                EpisodeRowComponent(it)
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
private fun SeasonHeader(seasonNumber: Int) {
    Text(
        text = "Season $seasonNumber",
        style = TextStyle(
            color = RickTextPrimary,
            fontSize = 32.sp,
            lineHeight = 32.sp,
            textAlign = TextAlign.Center,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = RickTextPrimary,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(vertical = 8.dp)
    )
}










