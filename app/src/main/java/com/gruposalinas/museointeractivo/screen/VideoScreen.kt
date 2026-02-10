package com.gruposalinas.museointeractivo.screen


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gruposalinas.museointeractivo.data.SectionsData

@Composable
fun VideoScreen(sectionTitle: String) {

    val section = SectionsData.getSection(sectionTitle)
    section ?: return

    LazyColumn(modifier = Modifier.padding(top = 60.dp)) {
        items(section.videoRes) { video ->
            VideoPlayer(video)
        }
    }
}
