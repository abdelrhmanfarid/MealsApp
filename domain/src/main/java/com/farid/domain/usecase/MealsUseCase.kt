package com.farid.domain.usecase

import com.farid.domain.repo.MealsRepo

class MealsUseCase(private val mealsRepo: MealsRepo) {

//    suspend fun getMealsFromRemote(){
//        mealsRepo.getMealsFromRemote()
//    }
    suspend operator fun invoke()= mealsRepo.getMealsFromRemote()
}