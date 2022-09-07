package com.example.rickandmorty.ui.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.model.DataCharacterInfo
import com.example.rickandmorty.domain.cases.add.UseCaseForAdd
import com.example.rickandmorty.domain.model.CharacterInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val useCaseForAdd: UseCaseForAdd): ViewModel() {

    private val characterInfo: CharacterInfo by lazy {
        characterInfo
    }

    suspend fun getFilms() {
        viewModelScope.launch (Dispatchers.IO) {
            useCaseForAdd.addNote(characterInfo)
        }
    }

    suspend fun getData(): MutableStateFlow<DataCharacterInfo> {
            return useCaseForAdd.addNote(characterInfo)
    }
}