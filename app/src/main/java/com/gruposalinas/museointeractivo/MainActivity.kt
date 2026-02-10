package com.gruposalinas.museointeractivo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.gruposalinas.museointeractivo.screen.AudioScreen
import com.gruposalinas.museointeractivo.screen.HomeScreen
import com.gruposalinas.museointeractivo.screen.ImagesScreen
import com.gruposalinas.museointeractivo.screen.SectionMenuScreen
import com.gruposalinas.museointeractivo.screen.VideoScreen
import com.gruposalinas.museointeractivo.ui.theme.MuseoInteractivoTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MuseoInteractivoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {  innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable("home") {
                            HomeScreen(navController)
                        }
                        composable(
                            route = "section_menu/{sectionTitle}",
                            arguments = listOf(
                                navArgument("sectionTitle") {
                                    type = NavType.StringType
                                }
                            )
                        ) {
                            SectionMenuScreen(
                                navController = navController,
                                sectionTitle = it.arguments?.getString("sectionTitle") ?: ""
                            )
                        }

                        composable(
                            route = "images/{sectionTitle}",
                            arguments = listOf(navArgument("sectionTitle") {
                                type = NavType.StringType
                            })
                        ) {
                            ImagesScreen(
                                sectionTitle = it.arguments?.getString("sectionTitle") ?: ""
                            )
                        }

                        composable(
                            route = "audios/{sectionTitle}",
                            arguments = listOf(navArgument("sectionTitle") {
                                type = NavType.StringType
                            })
                        ) {
                            AudioScreen(
                                sectionTitle = it.arguments?.getString("sectionTitle") ?: ""
                            )
                        }

                        composable(
                            route = "videos/{sectionTitle}",
                            arguments = listOf(navArgument("sectionTitle") {
                                type = NavType.StringType
                            })
                        ) {
                            VideoScreen(
                                sectionTitle = it.arguments?.getString("sectionTitle") ?: ""
                            )
                        }

                    }
                }
            }
        }
    }
}

