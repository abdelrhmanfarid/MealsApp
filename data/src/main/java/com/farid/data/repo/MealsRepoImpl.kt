package com.farid.data.repo

import com.farid.data.remote.ApiService
import com.farid.domain.repo.MealsRepo
import com.farid.domain.response.CategoriesResponse

class MealsRepoImpl (private val apiService: ApiService):MealsRepo{

    override suspend fun getMealsFromRemote(): CategoriesResponse = apiService.getMeals()


}