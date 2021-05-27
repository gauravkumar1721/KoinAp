package com.mindorks.framework.koin.data.api

import com.mindorks.framework.koin.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}