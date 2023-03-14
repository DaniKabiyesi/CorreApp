package com.correapp.notes.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.correapp.notes.domain.model.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    suspend fun loadNotes(): List<Note>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addNote(vararg note: Note): Note

    @Update
    suspend fun editNote(note: Note): Note

    @Delete
    suspend fun deleteNote()
}
