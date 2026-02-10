package com.gruposalinas.museointeractivo.data

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes

data class Section(
    val title: String,
    val description: String,
    @DrawableRes val imageRes: List<Int>,
    @RawRes val audioRes: List<Int>,
    @RawRes val videoRes: List<Int>
)
