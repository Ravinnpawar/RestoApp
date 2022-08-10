package com.ravindra.restoapp.data

import com.ravindra.restoapp.api.ApiRetrofit
import com.ravindra.restoapp.api.ServiceBuilder

class RepoRetrofit {

    val request = ServiceBuilder.buildService(ApiRetrofit::class.java)



    suspend fun getrest(): List<Restaurants> =request.getRest()

}