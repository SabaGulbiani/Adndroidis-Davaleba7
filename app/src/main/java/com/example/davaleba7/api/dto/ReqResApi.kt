package com.example.davaleba7.api.dto

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ReqResApi {

    @GET ("users")
    fun getUsers(@Query ("page") page: Int): Call<ReqResData<List<User>>>

    @GET("users")
    fun getUsersById(@Path("userId") userId: Int): Call<ReqResData<User>>
}