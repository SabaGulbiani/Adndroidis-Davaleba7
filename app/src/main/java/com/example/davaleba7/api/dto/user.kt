package com.example.davaleba7.api.dto


data class User (

    val id: Long?,

    val email: String?,

    val first_name: String?,

    val last_name: String?,

    val avatar: String?,

        )

data class ReqResData <T> (

    val page: Int?,

    val per_page: Int?,

    val total: Int?,

    val total_page: Int?,

    val data: T?


        )

