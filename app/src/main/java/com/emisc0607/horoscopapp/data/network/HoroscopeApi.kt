package com.emisc0607.horoscopapp.data.network

import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface HoroscopeApi {
    @POST(".")
    suspend fun getHoroscope(
        @Query("sign") sign:String,
        @Query("day") day:String
    ):Response<HoroscopeResponse>
}