package com.example.reezkyillma.kotlintujuh.service

import com.example.reezkyillma.kotlintujuh.model.Movie
import com.example.reezkyillma.kotlintujuh.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("movie/latest")
    fun getMovieLatest(@Query("api_key") apiKey : String) : Call<Movie>
    @GET("movie/popular")
    fun getPopularMovie(@Query("api_key") apiKey: String) : Call<MovieResponse>
}