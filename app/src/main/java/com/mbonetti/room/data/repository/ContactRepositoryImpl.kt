package com.mbonetti.room.data.repository

import com.mbonetti.room.data.data_source.ContactDatabase
import com.mbonetti.room.domain.model.Contact
import com.mbonetti.room.domain.repository.ContactRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ContactRepositoryImpl @Inject constructor(
    private val db: ContactDatabase
) : ContactRepository {

    override suspend fun upsertContact(contact: Contact) {
        db.getContactDao().upsertContact(contact)
    }

    override suspend fun deleteContact(contact: Contact) {
        db.getContactDao().deleteContact(contact)
    }

    override fun getContactsOrderedByFirstName(): Flow<List<Contact>> {
        return db.getContactDao().getContactsOrderedByFirstName()
    }

    override fun getContactsOrderedByLastName(): Flow<List<Contact>> {
        return db.getContactDao().getContactsOrderedByLastName()
    }

    override fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>> {
        return db.getContactDao().getContactsOrderedByPhoneNumber()
    }
}
