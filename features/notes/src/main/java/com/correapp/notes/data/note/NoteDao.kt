package com.correapp.notes.data.note

import androidx.room.*
import com.correapp.notes.domain.model.Note

@Dao
internal interface NoteDao {
    @Query("SELECT * FROM note")
    suspend fun loadNotes(): List<Note>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addNote(): Note

    @Update
    suspend fun editNote(note: Note): Note

    @Delete
    suspend fun deleteNote()
}