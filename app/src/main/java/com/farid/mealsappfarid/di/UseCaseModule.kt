package com.farid.mealsappfarid.di

import com.farid.domain.repo.MealsRepo
import com.farid.domain.usecase.MealsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(mealsRepo: MealsRepo):MealsUseCase{
        return MealsUseCase(mealsRepo)
    }
}