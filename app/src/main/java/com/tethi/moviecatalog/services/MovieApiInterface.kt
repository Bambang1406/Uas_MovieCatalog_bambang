package com.tethi.moviecatalog.services

import retrofit2.Call
import com.tethi.moviecatalog.models.MovieResponse
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=64440a3551e19bc2fe82d0ac2f0056cc")
    fun getMovieList(): Call<MovieResponse>

}