package com.correapp.notes.domain.repository

import android.content.Context
import com.correapp.notes.data.NoteDataBase
import com.correapp.notes.domain.model.Note

internal interface NoteRepository {
    suspend fun loadNotes(): List<Note>
    suspend fun addNote(): Note
    suspend fun editNote(note: Note): Note
    suspend fun deleteNote()
}

internal class NoteRepositoryImpl(
    private val context: Context,
    private val dataBase: NoteDataBase
) : NoteRepository {

    private val db = NoteDataBase.getDataBaseInstance(context)

    override suspend fun loadNotes(): List<Note> = db.noteDao().loadNotes()

    override suspend fun addNote() = db.noteDao().addNote()

    override suspend fun editNote(note: Note): Note = db.noteDao().editNote(note)

    override suspend fun deleteNote() = db.noteDao().deleteNote()

}
