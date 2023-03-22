package com.correapp.notes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.correapp.notes.data.dao.FolderDao
import com.correapp.notes.data.dao.NoteDao
import com.correapp.notes.data.entity.FolderEntity
import com.correapp.notes.data.entity.NoteEntity

@Database(entities = [NoteEntity::class, FolderEntity::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
    abstract fun folderDao(): FolderDao
}
