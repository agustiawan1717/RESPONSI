package com.agustiawan.demoproject


import retrofit2.Call
import retrofit2.http.GET

// TODO 5 : API

interface NetWorkApi{

    @GET("/")
    fun getProducts(): Call<List<ProductFamily>>

}
