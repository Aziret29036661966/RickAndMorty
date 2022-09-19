package com.example.rickandmorty.data.service

import com.example.rickandmorty.data.model.DataCharacterInfo
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMorty {

    @GET("character")
    suspend fun getCharacter(@Query("page") page : Int): Response<DataCharacterInfo>

}