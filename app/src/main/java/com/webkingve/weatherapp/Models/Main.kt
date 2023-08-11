package com.webkingve.weatherapp.Models

data class Main(
    val temp: Double,
    val pressure: Double,
    val humidity: Int,
    val temp_min: Double,
    val temp_max: Double,
    val feels_like: Double,
    val sea_level: Double,
    val grnd_level: Double
): java.io.Serializable
