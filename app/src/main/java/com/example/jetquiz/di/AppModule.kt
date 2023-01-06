package com.example.jetquiz.di

import com.example.jetquiz.network.QuestionApi
import com.example.jetquiz.repository.QuestionRepository
import com.example.jetquiz.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideQuestionRepository(api: QuestionApi) = QuestionRepository(api)

    @Provides
    @Singleton
    fun provideQuestionApi(): QuestionApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionApi::class.java)
    }
}