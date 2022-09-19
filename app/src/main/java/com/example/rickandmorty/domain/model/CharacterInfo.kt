package com.example.rickandmorty.domain.model

import com.example.rickandmorty.data.common.Resource
import kotlinx.coroutines.flow.Flow

data class CharacterInfo (
  val count: Int,
  val pages : Int,
  val next : String,
  val results: List<Resource<CharacterResult>?>
  )