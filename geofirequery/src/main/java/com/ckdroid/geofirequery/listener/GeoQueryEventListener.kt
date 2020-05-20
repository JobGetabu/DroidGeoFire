package com.ckdroid.geofirequery.listener

import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestoreException

interface GeoQueryEventListener {
    fun onEvent(
        fireStoreException: FirebaseFirestoreException? = null,
        addedAndModifiedData: MutableList<DocumentSnapshot> = mutableListOf(),
        removedData: MutableList<DocumentSnapshot> = mutableListOf()
    )

    fun onEvent(
        fireStoreException: FirebaseFirestoreException? = null,
        addedList: MutableList<DocumentSnapshot> = mutableListOf(),
        modifiedList: MutableList<DocumentSnapshot> = mutableListOf(),
        removedData: MutableList<DocumentSnapshot> = mutableListOf()
    )
}