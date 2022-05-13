package com.example.davaleba7

import android.app.Application
import com.example.davaleba7.api.dto.RestClient

class APP: Application() {

    override fun onCreate() {
        super.onCreate()

        RestClient.initClients()
    }

}