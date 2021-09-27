package com.example.evaluation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var musicList:List<ResultsDTO>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apiCall("string")

    }

    private fun apiCall(s: String) {
        var apiClient = Network.getInstance().create(ApiClient::class.java)
        apiClient.getMusic(s).enqueue(object : Callback<ResponseDTO>{
            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                response.body()?.run {

                }
            }

            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }

    private fun setAdapter() {
        TODO("Not yet implemented")
    }


}