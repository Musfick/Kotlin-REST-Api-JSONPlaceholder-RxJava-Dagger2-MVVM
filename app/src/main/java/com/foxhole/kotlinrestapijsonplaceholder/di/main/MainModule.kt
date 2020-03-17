package com.foxhole.kotlinrestapijsonplaceholder.di.main

import com.foxhole.kotlinrestapijsonplaceholder.adapter.RecyclerViewAdapter
import com.foxhole.kotlinrestapijsonplaceholder.ui.main.MainRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MainModule {

    @Provides
    fun provideMainApi (retrofit: Retrofit) : MainApi {
        return retrofit.create(MainApi::class.java)
    }

    @Provides
    fun provideMainRepository(mainApi: MainApi) : MainRepository {
        return MainRepository(mainApi)
    }

    @Provides
    fun provideRecyclerViewAdapter() = RecyclerViewAdapter()
}