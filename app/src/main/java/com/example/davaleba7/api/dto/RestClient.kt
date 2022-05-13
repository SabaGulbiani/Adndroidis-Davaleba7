package com.example.davaleba7.api.dto

import okhttp3.OkHttpClient
import retrofit2.Retrofit

object RestClient {

    private lateinit var retrofit: Retrofit
    private lateinit var okHttpClient: OkHttpClient

    fun initClients () {

        okHttpClient = OkHttpClient.Builder()
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl("https://reqres.in/api/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun <S> getService(serviceClass: Class <S> ): S {
        return retrofit.create(serviceClass)
    }

    val getReqResApi: ReqResApi
        get() = getService(ReqResApi::class.java)
}