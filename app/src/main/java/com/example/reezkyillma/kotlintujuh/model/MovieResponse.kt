package com.example.reezkyillma.kotlintujuh.model


    data class MovieResponse(var page : Int,
                             val results : ArrayList<Movie>,
                             val totalResult : Int,
                             val totalPage : Int)
