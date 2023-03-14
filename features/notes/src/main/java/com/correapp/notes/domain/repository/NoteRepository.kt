package com.correapp.notes.domain.repository

import com.correapp.notes.data.dao.NoteDao
import com.correapp.notes.domain.model.Note
import javax.inject.Inject

interface NoteRepository {
    suspend fun loadNotes(): List<Note>
    suspend fun addNote(note: Note): Note
    suspend fun editNote(note: Note): Note
    suspend fun deleteNote()
}

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository {
    override suspend fun loadNotes(): List<Note> = noteDao.loadNotes()

    override suspend fun addNote(note: Note): Note = noteDao.addNote()

    override suspend fun editNote(note: Note): Note = noteDao.editNote(note)

    override suspend fun deleteNote() = noteDao.deleteNote()
}
