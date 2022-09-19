package com.example.rickandmorty.domain.cases.add

import com.example.rickandmorty.data.common.Resource
import com.example.rickandmorty.domain.model.CharacterInfo
import com.example.rickandmorty.domain.repository.RickAndMortyRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UseCaseForAdd @Inject constructor(private val rickAndMortyRepo: RickAndMortyRepo){

    suspend fun addNote(info: CharacterInfo): Flow<Resource<CharacterInfo?>> {
        return rickAndMortyRepo.getCharacter(info)
    }

}