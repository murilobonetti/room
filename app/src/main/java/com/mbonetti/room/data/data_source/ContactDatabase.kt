package com.mbonetti.room.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mbonetti.room.domain.model.Contact

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun getContactDao(): ContactDao
}
