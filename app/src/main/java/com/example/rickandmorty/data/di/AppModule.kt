package com.example.rickandmorty.data.di

import com.example.rickandmorty.data.service.RickAndMorty
import com.example.rickandmorty.data.repository.RickAndMortyApiImpl
import com.example.rickandmorty.domain.repository.RickAndMortyRepo
import com.example.rickandmorty.utils.const.MY_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun providerAPI(): RickAndMorty? {
        return Retrofit.Builder()
            .baseUrl(MY_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RickAndMorty::class.java)
    }

    @Provides
    @Singleton
    fun provideRepo(api: RickAndMorty): RickAndMortyRepo {
        return RickAndMortyApiImpl(api)
    }

}