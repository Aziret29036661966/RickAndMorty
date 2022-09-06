package com.example.rickandmorty.data.api

import com.example.rickandmorty.data.model.DataCharacterInfo
import com.example.rickandmorty.data.model.DataCharacterResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMorty {

    @GET("character")
    suspend fun getCharacter(@Query("page") page : Int): Call<DataCharacterInfo>

}