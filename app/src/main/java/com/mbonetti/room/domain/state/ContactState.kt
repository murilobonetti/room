package com.mbonetti.room.domain.state

import com.mbonetti.room.domain.model.Contact
import com.mbonetti.room.domain.util.SortType

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)
