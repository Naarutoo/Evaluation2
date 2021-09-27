package com.example.evaluation2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {
    @GET("search")
    fun getMusic(@Query("term") term: String):Call<ResponseDTO>
}