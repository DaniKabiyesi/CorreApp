package com.correapp.notes.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.correapp.notes.data.folder.FolderDao
import com.correapp.notes.data.note.NoteDao
import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.model.Note

@Database(entities = [Note::class, Folder::class], version = 1)
internal abstract class NoteDataBase: RoomDatabase() {

    abstract fun noteDao(): NoteDao
    abstract fun folderDao(): FolderDao

    companion object {
        @Volatile
        private var db: NoteDataBase? = null

        fun getDataBaseInstance(context: Context): NoteDataBase {
            if(db != null) return db!!

            synchronized(this) {
                db = Room
                    .databaseBuilder(
                        context.applicationContext,
                        NoteDataBase::class.java,
                        "Database-note"
                    ).build()
                return db!!
            }
        }
    }
}