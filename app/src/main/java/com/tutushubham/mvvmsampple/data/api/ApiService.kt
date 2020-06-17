package com.tutushubham.mvvmsampple.data.api

import com.tutushubham.mvvmsampple.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>


}