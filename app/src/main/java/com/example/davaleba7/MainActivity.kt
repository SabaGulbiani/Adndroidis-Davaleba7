package com.example.davaleba7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.davaleba7.api.dto.ReqResData
import com.example.davaleba7.api.dto.RestClient
import com.example.davaleba7.api.dto.User
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RestClient.getReqResApi.getUsers(1). enqueue(object : retrofit2.Callback<ReqResData<List<User>>> {
            override fun onResponse(
                call: Call<ReqResData<List<User>>>,
                response: Response<ReqResData<List<User>>>
            ) {
               if (response.isSuccessful && response.body() !=null) {
                   response.body() !!.data?.forEach{user -> Log.d("MyData", user.toString()) }
               }
            }

            override fun onFailure(call: Call<ReqResData<List<User>>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        } )
    }
}