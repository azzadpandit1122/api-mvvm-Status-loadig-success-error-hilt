package com.example.mvvmwithretrofitandflow.data

import retrofit2.http.GET

interface ApiService {

    //    https://imdb-api.com/en/API/MostPopularMovies/k_872lj813
    @GET("/API/MostPopularMovies/k_872lj813")
    suspend fun getMostPopularMovies() : MovieResponse




}