package kst.app.fcairbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("v3/cc6b0f1f-9b59-47f0-86fb-f64ae6e12e60")
    fun getHouseList(): Call<HouseDto>
}