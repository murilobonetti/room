package com.mbonetti.room.domain.repository

import com.mbonetti.room.domain.model.Contact
import kotlinx.coroutines.flow.Flow

interface ContactRepository {

    suspend fun upsertContact(contact: Contact)

    suspend fun deleteContact(contact: Contact)

    fun getContactsOrderedByFirstName(): Flow<List<Contact>>

    fun getContactsOrderedByLastName(): Flow<List<Contact>>

    fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>>
}
