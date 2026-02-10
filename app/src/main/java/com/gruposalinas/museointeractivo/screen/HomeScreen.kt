package com.gruposalinas.museointeractivo.screen



import android.content.Intent
import android.net.Uri
import com.gruposalinas.museointeractivo.R
import android.os.Bundle
import android.telecom.Call
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.gruposalinas.museointeractivo.data.Section
import com.gruposalinas.museointeractivo.data.SectionsData
import kotlin.jvm.java


@Composable
fun HomeScreen(navController: NavController) {
    val context = LocalContext.current

    LazyColumn(modifier = Modifier.padding(top = 50.dp)) {
       items(SectionsData.sections) { section ->
           Card(
               modifier = Modifier
                   .padding(16.dp)
                   .fillMaxWidth()
                   .clickable{
                       navController.navigate(

                           "section_menu/${Uri.encode(section.title)}"
                       )
                   },
               elevation = CardDefaults.cardElevation(8.dp)

           ){
               Column {
                   Image(painter = painterResource(id = section.imageRes.first()),
                       contentDescription = section.title,
                       modifier = Modifier.height(200.dp)
                   )

                   Text(
                       text = section.title,
                       fontSize = 24.sp,
                       fontWeight = FontWeight.Bold,
                       modifier = Modifier.padding(8.dp)
                   )


               }
           }
       }
    }


}


