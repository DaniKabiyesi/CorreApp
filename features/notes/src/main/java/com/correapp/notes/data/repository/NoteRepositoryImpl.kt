package com.correapp.notes.data.repository

import com.correapp.notes.data.dao.NoteDao
import com.correapp.notes.domain.model.Note
import com.correapp.notes.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao,
) : NoteRepository {
    override suspend fun loadNotes(): List<Note> = noteDao.loadNotes().map { it.toNote() }

    override suspend fun addNote(note: Note) = noteDao.addNote()

    override suspend fun editNote(note: Note): Note = noteDao.editNote(note).toNote()

    override suspend fun deleteNote() = noteDao.deleteNote()
}
