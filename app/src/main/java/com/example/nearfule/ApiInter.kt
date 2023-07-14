package com.example.nearfule

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInter {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat:String,
        @Query("lon") lon:String,
        @Query("APPID") appid:String
    ): Call<WM>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q:String,
        @Query("APPID") appid:String
    ): Call<WM>


}