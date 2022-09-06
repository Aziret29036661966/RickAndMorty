package com.example.rickandmorty.domain.model

import com.example.rickandmorty.utils.const.DEFAULT_ID

data class CharacterResult (
    val id: Int = DEFAULT_ID,
    val name : String? = null,
    val status: String? = null,
)


