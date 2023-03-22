package com.correapp.notes.data.entity

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.correapp.notes.domain.model.Note

data class FolderEntity(
    @PrimaryKey() val id: String,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("notes") val notes: List<Note>?
)