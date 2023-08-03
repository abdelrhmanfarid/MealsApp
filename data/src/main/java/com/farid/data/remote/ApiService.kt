package com.farid.data.remote

import com.farid.domain.response.CategoriesResponse
import retrofit2.http.GET

interface ApiService {

    @GET("categories.php")
    suspend fun getMeals():CategoriesResponse
}