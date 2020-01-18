package com.example.list_and_tab_practice_kotlin.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

object HttpClient{
    private const val TIMEOUT_CONNECT: Long = 15
    private const val TIMEOUT_WRITE: Long = 15
    private const val TIMEOUT_READ: Long = 15
//    private const val URL = "https://droidkaigi-api.appspot.com/2019/api/"
    private const val URL = "https://api.droidkaigi.jp/2020/"

    private var mClient: OkHttpClient
    private var mRetrofit: Retrofit
    private var mRetrofitInterface: RetrofitInterface

    init{
        val logInterceptor = HttpLoggingInterceptor()
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY

        mClient = OkHttpClient().newBuilder().apply {
            addInterceptor(logInterceptor)
            connectTimeout(TIMEOUT_CONNECT, TimeUnit.SECONDS)
            writeTimeout(TIMEOUT_WRITE, TimeUnit.SECONDS)
            readTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
        }.build()

        mRetrofit = Retrofit.Builder().apply {
            baseUrl(URL)
            client(mClient)
            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            addConverterFactory(GsonConverterFactory.create())
        }.build()

        mRetrofitInterface = mRetrofit.create()
    }

    fun getInstance(): RetrofitInterface {
        return mRetrofitInterface
    }
}