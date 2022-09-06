package com.example.rickandmorty.domain.repository

import com.example.rickandmorty.data.model.DataCharacterInfo
import com.example.rickandmorty.domain.model.CharacterInfo
import com.example.rickandmorty.domain.model.CharacterResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

interface RickAndMortyRepo  {

    suspend fun getCharacter(characterInfo: CharacterInfo): MutableStateFlow<DataCharacterInfo>
    fun <T> MutableStateFlow(value: CharacterInfo): MutableStateFlow<T>


}