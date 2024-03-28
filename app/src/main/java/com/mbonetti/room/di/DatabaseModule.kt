package com.mbonetti.room.di

import android.content.Context
import androidx.room.Room
import com.mbonetti.room.data.data_source.ContactDao
import com.mbonetti.room.data.data_source.ContactDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideContactDao(database: ContactDatabase): ContactDao {
        return database.getContactDao()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): ContactDatabase {
        return Room.databaseBuilder(
            appContext,
            ContactDatabase::class.java,
            "contacts.db"
        ).build()
    }
}
