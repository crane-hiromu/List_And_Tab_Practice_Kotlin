package com.example.list_and_tab_practice_kotlin.network

import android.annotation.SuppressLint
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DroidCliant {

    private val TAG = "MainActivity"

    @SuppressLint("CheckResult")
    fun call() {
        val client = HttpClient.getInstance()
        client.requestContributors()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnError {
                Log.d(TAG, "doOnError")
            }
            .unsubscribeOn(Schedulers.io())
            .onErrorReturn { t: Throwable ->
                Log.d(TAG, "onErrorReturn : " + t.message)
                arrayOf(Contributors())
            }
            .subscribe { result ->
                if ("User" == result[0].type) {
                    Log.d(TAG, result[0].toString())
                } else {
                    Log.d(TAG, "subscribe ng")
                }
            }
    }
}
