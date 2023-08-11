package com.webkingve.weatherapp.Models

data class Sys(
    val type: Int,
    val message: Double,
    val country: String,
    val sunrise: Int,
    val sunset: Int
): java.io.Serializable
