// Retrofit interface
package com.example.dsu_retrofit

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}
