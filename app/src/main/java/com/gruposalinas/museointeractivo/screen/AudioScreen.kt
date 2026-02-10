package com.gruposalinas.museointeractivo.screen

import android.media.MediaPlayer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.gruposalinas.museointeractivo.data.SectionsData


@Composable
fun AudioScreen(sectionTitle: String) {

    val section = SectionsData.getSection(sectionTitle)
    section ?: return

    LazyColumn(modifier = Modifier.padding(top = 40.dp)) {
        items(section.audioRes) { audio ->
            VideoPlayer(audio)

        }
    }
}
