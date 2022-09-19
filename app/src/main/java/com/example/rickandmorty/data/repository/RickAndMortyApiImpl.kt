package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.common.Resource
import com.example.rickandmorty.data.service.RickAndMorty
import com.example.rickandmorty.domain.model.CharacterInfo
import com.example.rickandmorty.domain.repository.RickAndMortyRepo
import kotlinx.coroutines.flow.*
import javax.inject.Inject


class RickAndMortyApiImpl @Inject constructor(private var api: RickAndMorty) : RickAndMortyRepo {


    /*  override suspend fun getCharacter(characterInfo: CharacterInfo): MutableStateFlow<DataCharacterInfo> {
        val page = 1
        val flow = MutableStateFlow<DataCharacterInfo>(characterInfo)
            api.getCharacter(page).enqueue(object : Callback<DataCharacterInfo> {
                override fun onResponse(call: Call<DataCharacterInfo>, response: Response<DataCharacterInfo?>) {
                    if (response.isSuccessful && response.body() != null)
                        flow.value= response.body()!!
                }

                override fun onFailure(call: Call<DataCharacterInfo>, t: Throwable) {}
            })
            return flow
        }

    override fun <T> MutableStateFlow(value: CharacterInfo): MutableStateFlow<T> {
        TODO("Not yet implemented")
    }*/
    override suspend fun getCharacter(characterInfo: CharacterInfo): Flow<Resource<CharacterInfo?>> = flow{
        val result = api.getCharacter(1)
        emit(Resource.loading())
        if (result.isSuccessful && result.body() != null){
        }else{

        }

    }

}


