package com.mindorks.framework.koin.data.api

import com.mindorks.framework.koin.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}