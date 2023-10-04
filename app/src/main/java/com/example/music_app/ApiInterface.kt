package com.example.music_app

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
interface ApiInterface {

    @Headers(
        "X-RapidAPI-Key: c1708e6e1fmsha6ae5b5c6b4995ap1e5c43jsn260126119c75",
        "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com"
    )
    @GET("search")
    fun getData(@Query("q") query: String): Call<MyData>
}