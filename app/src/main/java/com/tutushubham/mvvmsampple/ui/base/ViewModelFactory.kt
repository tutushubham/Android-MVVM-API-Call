package com.tutushubham.mvvmsampple.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tutushubham.mvvmsampple.data.api.ApiHelper
import com.tutushubham.mvvmsampple.data.repository.MainRepository
import com.tutushubham.mvvmsampple.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) return MainViewModel(MainRepository(
            apiHelper
        )) as T
        throw IllegalArgumentException("Unknown class name")
    }

}