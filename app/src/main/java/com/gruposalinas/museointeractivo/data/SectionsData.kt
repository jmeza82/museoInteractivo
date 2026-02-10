package com.gruposalinas.museointeractivo.data

import com.gruposalinas.museointeractivo.R

object SectionsData {
    val sections = listOf<Section>(
        Section(
            "Vida Cotidiana",
            "Conoce cómo vivían los egipcios en el pasado",
            imageRes = listOf(
                R.drawable.life_1,
                R.drawable.life_2,
                R.drawable.life_3,
                R.drawable.life_4,
                R.drawable.life_5,
                R.drawable.life_6,
                R.drawable.life_7,
                R.drawable.life_8,
                R.drawable.life_9,
                R.drawable.life_10,
            ),
            audioRes = listOf(
                R.raw.audio1,
                R.raw.audio2,
                R.raw.audio3,
                R.raw.audio4,
                R.raw.audio5,
            ),
            videoRes = listOf(
                R.raw.video1,
                R.raw.video2,
                R.raw.video3,
                R.raw.video4,
                R.raw.video5,
            )

        ),
        Section(
            "Arquitectura",
            "Esculturas y pinturas que existian en su tiempo",
            imageRes = listOf(
                R.drawable.arq_1,
                R.drawable.arq_2,
                R.drawable.arq_3,
                R.drawable.arq_4,
                R.drawable.arq_5,
                R.drawable.arq_6,
                R.drawable.arq_7,
                R.drawable.arq_8,
                R.drawable.arq_9,
                R.drawable.arq_10,
            ),
            audioRes = listOf(
                R.raw.audio1,
                R.raw.audio2,
                R.raw.audio3,
                R.raw.audio4,
                R.raw.audio5,
            ),
            videoRes = listOf(
                R.raw.video1,
                R.raw.video2,
                R.raw.video3,
                R.raw.video4,
                R.raw.video5,
            )
        ),

        Section(
            "Arte",
            "Esculturas y pinturas que crearon",
            imageRes = listOf(
                R.drawable.art_1,
                R.drawable.art_2,
                R.drawable.art_3,
                R.drawable.art_4,
                R.drawable.art_5,
                R.drawable.art_6,
                R.drawable.art_7,
                R.drawable.art_8,
                R.drawable.art_9,
                R.drawable.art_10,
            ),
            audioRes = listOf(
                R.raw.audio1,
                R.raw.audio2,
                R.raw.audio3,
                R.raw.audio4,
                R.raw.audio5,
            ),
            videoRes = listOf(
                R.raw.art_1,
                R.raw.art_2,
                R.raw.art_3,
                R.raw.art_4,
                R.raw.art_5,
            )
        )
    )

    fun getSection(title: String): Section? {
        return sections.find { it.title == title }
    }
}