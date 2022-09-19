package com.example.rickandmorty.domain.repository

import com.example.rickandmorty.data.common.Resource
import com.example.rickandmorty.domain.model.CharacterInfo
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepo  {

    suspend fun getCharacter(characterInfo: CharacterInfo): Flow<Resource<CharacterInfo?>>

}