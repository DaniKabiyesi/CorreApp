package com.correapp.notes.domain.repository

import com.correapp.notes.domain.model.Note

interface NoteRepository {
    suspend fun loadNotes(): List<Note>
    suspend fun addNote(note: Note)
    suspend fun editNote(note: Note): Note
    suspend fun deleteNote()
}
