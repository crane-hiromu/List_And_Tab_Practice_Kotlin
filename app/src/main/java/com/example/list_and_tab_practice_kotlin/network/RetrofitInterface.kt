package com.example.list_and_tab_practice_kotlin.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

// https://api.github.com/repos/[owner_name]/[repositories_name]/contributors

interface RetrofitInterface{
    @GET("speakers")
    fun requestContributors() : Single<Array<Contributors>>
}