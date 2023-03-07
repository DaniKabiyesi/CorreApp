package com.correapp.notes.domain.repository

import com.correapp.notes.data.NoteDataBase
import com.correapp.notes.domain.model.Note

internal interface NoteRepository {
    fun loadNotes(): List<Note>
    fun addNote(): Note
    fun editNote(): Note
    fun deleteNote()
}

internal class NoteRepositoryImpl(
    private val dataBase: NoteDataBase
) : NoteRepository {

    override fun loadNotes(): List<Note> = TODO()

    override fun addNote(): Note {
        TODO("Not yet implemented")
    }

    override fun editNote(): Note {
        TODO("Not yet implemented")
    }

    override fun deleteNote() {
        TODO("Not yet implemented")
    }
}
