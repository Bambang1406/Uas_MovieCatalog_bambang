package com.tethi.moviecatalog.services

import com.tethi.moviecatalog.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/movie/popular?api_key=64440a3551e19bc2fe82d0ac2f0056cc")
    fun getTVList(): Call<TVResponse>

}