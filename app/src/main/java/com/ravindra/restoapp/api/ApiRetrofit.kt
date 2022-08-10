package com.ravindra.restoapp.api

import com.ravindra.restoapp.data.Restaurants
import retrofit2.http.GET

interface ApiRetrofit {
    companion object {
        const val BASE_URL: String = "https://random-data-api.com/api/"
    }

    @GET("restaurant/random_restaurant?size=20")
    suspend fun getRest(): List<Restaurants>
}