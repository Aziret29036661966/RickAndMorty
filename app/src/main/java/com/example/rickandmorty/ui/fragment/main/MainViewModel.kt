package com.example.rickandmorty.ui.fragment.main


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.common.Resource
import com.example.rickandmorty.domain.cases.add.UseCaseForAdd
import com.example.rickandmorty.domain.model.CharacterInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow

import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel @Inject constructor(private var useCaseForAdd: UseCaseForAdd): ViewModel() {

    private val characterInfo: CharacterInfo by lazy {
        characterInfo
    }

    fun getCharacter() {
        viewModelScope.launch{
            withContext(Dispatchers.IO) { useCaseForAdd.addNote(characterInfo) } }
    }

    suspend fun getData(): Flow<Resource<CharacterInfo?>> {
            return useCaseForAdd.addNote(characterInfo)
    }
}