package com.tutushubham.mvvmsampple.data.repository

import com.tutushubham.mvvmsampple.data.api.ApiHelper
import com.tutushubham.mvvmsampple.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}