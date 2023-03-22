package com.correapp.notes.domain.model
data class Folder(
    val id: String,
    val name: String,
    val notes: List<Note>
)
