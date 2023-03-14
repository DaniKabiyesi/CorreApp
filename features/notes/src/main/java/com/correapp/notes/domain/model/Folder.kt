package com.correapp.notes.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Folder(
    @PrimaryKey() val id: String,
    @ColumnInfo() val name: String,
    @ColumnInfo() val notes: List<Note>,
)
