package kst.app.fcairbnb

import java.util.function.IntToLongFunction

data class HouseModel(
    val id: Int,
    val title: String,
    val price: String,
    val imgUrl: String,
    val lat: Double,
    val lon: Double
)
