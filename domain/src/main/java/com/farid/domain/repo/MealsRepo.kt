package com.farid.domain.repo

import com.farid.domain.response.CategoriesResponse

// this is similar to the Remote Repo in shareCoin consumer app
interface MealsRepo {

    suspend fun getMealsFromRemote():CategoriesResponse


}