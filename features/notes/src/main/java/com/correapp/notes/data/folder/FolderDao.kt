package com.correapp.notes.data.folder

import androidx.room.Dao
import com.correapp.notes.domain.model.Note

@Dao
internal interface FolderDao {
    fun getNotes(folderName: String): List<Note>
}