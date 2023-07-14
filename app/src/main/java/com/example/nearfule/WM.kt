package com.example.nearfule

data class WM (
    val base: String,
    val clouds: cloud,
    val cod: Int,
    val coord: coords,
    val dt: Int,
    val id: Int,
    val main: main,
    val name: String,
    val rain: Rain,
    val sys: sky,
    val timezone: Int,
    val visibility: Int,
    val weather: List<weather>,
    val wind: Wind
    )
