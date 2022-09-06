package com.example.rickandmorty.domain.cases.add

import com.example.rickandmorty.domain.model.CharacterInfo
import com.example.rickandmorty.domain.repository.RickAndMortyRepo
import javax.inject.Inject

class UseCaseForAdd @Inject constructor(private val rickAndMortyRepo: RickAndMortyRepo){

    fun addNote(info: CharacterInfo) = rickAndMortyRepo.getCharacter(info)

}