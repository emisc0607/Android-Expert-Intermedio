package com.emisc0607.horoscopapp.data.network

import com.google.gson.annotations.SerializedName

data class HoroscopeResponse(
    @SerializedName("current_date") val currentDate: String,
    @SerializedName("compatibility") val compatibility: String,
    @SerializedName("lucky_time") val luckyTime: String,
    @SerializedName("lucky_number") val luckyNumber: String,
    @SerializedName("color") val color: String,
    @SerializedName("date_range") val dateRange: String,
    @SerializedName("mood") val mood: String,
    @SerializedName("description") val description: String
)