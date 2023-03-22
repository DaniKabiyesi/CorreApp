package com.correapp.notes.domain.model

data class Note(
    val id: Int,
    val title: String,
    val description: String,
    val folder: String? = null,
)
