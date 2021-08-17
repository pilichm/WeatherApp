package pl.pilichm.weatherapp.models

import java.io.Serializable

data class Coord(
    val lon: Double,
    val lat: Double
) : Serializable