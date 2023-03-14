package com.correapp.notes.di

import android.content.Context
import androidx.room.Room
import com.correapp.notes.data.NoteDataBase
import com.correapp.notes.data.dao.FolderDao
import com.correapp.notes.data.dao.NoteDao
import com.correapp.notes.domain.repository.FolderRepository
import com.correapp.notes.domain.repository.FolderRepositoryImpl
import com.correapp.notes.domain.repository.NoteRepository
import com.correapp.notes.domain.repository.NoteRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(NotesApplication::class)
abstract class NotesModule {

    @Provides
    @Singleton
    fun providesNoteDataBase(
        @ApplicationContext context: Context,
    ): NoteDataBase {
        return Room.databaseBuilder(context, NoteDataBase::class.java, "note-database")
            .build()
    }

    @Binds
    abstract fun provideNoteDao(noteDataBase: NoteDataBase): NoteDao

    @Binds
    abstract fun providesFolderDao(noteDataBase: NoteDataBase): FolderDao

    @Binds
    abstract fun providesFolderRepository(folderRepositoryImpl: FolderRepositoryImpl): FolderRepository

    @Binds
    abstract fun providesNoteRepository(noteRepositoryImpl: NoteRepositoryImpl): NoteRepository
}
