package com.webkingve.weatherapp.Models

data class Sys(
    val type: Int,
    val message: Double,
    val country: String,
    val sunrise: Long,
    val sunset: Long
): java.io.Serializable
