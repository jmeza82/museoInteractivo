package com.gruposalinas.museointeractivo.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gruposalinas.museointeractivo.data.SectionsData

@Composable
fun ImagesScreen(sectionTitle: String) {

    val section = SectionsData.getSection(sectionTitle)
    section ?: return

    LazyColumn(modifier = Modifier.padding(top = 40.dp)) {
        items(section.imageRes) { image ->
            Image(
                painter = painterResource(image),
                contentDescription = section.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(8.dp)
            )
        }
    }
}
