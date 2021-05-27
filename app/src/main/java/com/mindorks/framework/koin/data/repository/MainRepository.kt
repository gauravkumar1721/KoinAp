package com.mindorks.framework.koin.data.repository

import com.mindorks.framework.koin.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}