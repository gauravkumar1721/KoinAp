package com.mindorks.framework.koin.di.module

import com.mindorks.framework.koin.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}