package com.example.rickandmorty.data.model

import com.example.rickandmorty.utils.const.DEFAULT_ID

data class DataCharacterResult(
    val id: Int = DEFAULT_ID,
    val name : String?=null,
    val status: String?=null,
)