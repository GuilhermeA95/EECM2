package com.eecm.weather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CidadeClimaREST {

    @GET("weather")
    fun getClimaCidade(@Query("id") id: String,
                       @Query("appid") appid:String,
                       @Query("units") units: String): Call<Cidade>

}