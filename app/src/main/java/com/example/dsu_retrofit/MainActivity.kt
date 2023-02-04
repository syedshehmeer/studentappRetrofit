package com.example.dsu_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

//https://quotable.io/quotes?page=1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesApi = `RetrofitInstance`.getInstance().create(ApiInterface::class.java)
        // launching a new coroutine
        GlobalScope.launch {
            val result = quotesApi.getQuotes()
            if (result != null)
            // Checking the results
                Log.d("ayush: ", result.body().toString())
        }

    }
}