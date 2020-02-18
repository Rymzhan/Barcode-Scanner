package com.example.dimash.barcodescanner.data.network

import com.example.dimash.barcodescanner.data.model.firm.FirmStructure
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://api.kmf.kz:8443/practice/"

interface ApiService{
    @GET("firmList")
    fun getFirmList(): Deferred<FirmStructure>

    companion object{
        operator fun invoke(connectivityInterceptor: Interceptor
        ):ApiService{
            val requestInterceptor = Interceptor { chain ->
                val url=chain.request()
                    .url()
                    .newBuilder()
                    .build()
                val request =chain.request()
                    .newBuilder()
                    .url(url)
                    .build()

                return@Interceptor chain.proceed(request)
            }
            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .addInterceptor(connectivityInterceptor)
                .build()
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }

    }
}