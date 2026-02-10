package com.gruposalinas.museointeractivo.screen

import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Collections
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.gruposalinas.museointeractivo.data.SectionsData

@Composable
fun SectionMenuScreen(
    navController: NavController,
    sectionTitle: String
) {
    val section = SectionsData.getSection(sectionTitle)

    section ?: return

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = section.title,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 60.dp)

        )
        Text(section.description)

        Spacer(modifier = Modifier.height(40.dp))

        MenuCard("Ver imágenes", Icons.Default.Collections) {
            navController.navigate("images/${Uri.encode(section.title)}")
        }

        MenuCard("Oír audios", Icons.Default.Headphones) {
            navController.navigate("audios/${Uri.encode(section.title)}")
        }

        MenuCard("Ver videos", Icons.Default.PlayArrow) {
            navController.navigate("videos/${Uri.encode(section.title)}")
        }
    }
}

@Composable
fun MenuCard(
    text: String,
    icon: ImageVector,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(icon, contentDescription = text, modifier = Modifier.size(40.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(text, fontSize = 22.sp)
        }
    }
}
