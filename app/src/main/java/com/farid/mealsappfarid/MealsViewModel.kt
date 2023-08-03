package com.farid.mealsappfarid

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farid.domain.response.CategoriesResponse
import com.farid.domain.usecase.MealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val mealsUseCase: MealsUseCase
) : ViewModel() {

    private val _categories: MutableStateFlow<CategoriesResponse?> = MutableStateFlow(null)
    val categories: StateFlow<CategoriesResponse?> = _categories

    fun getMeals(){
        viewModelScope.launch{
            try {
                _categories.value = mealsUseCase()
            } catch (e: Exception){
                Log.e("MealsViewModel", e.message.toString())
            }
        }
    }
}