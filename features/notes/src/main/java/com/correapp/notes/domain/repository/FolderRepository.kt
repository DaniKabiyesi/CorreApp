package com.correapp.notes.domain.repository

import android.content.Context
import com.correapp.notes.data.NoteDataBase
import com.correapp.notes.data.folder.FolderDao
import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.model.Note
import kotlin.coroutines.coroutineContext

internal interface FolderRepository {
    suspend fun loadFolder(folderName: String): List<Note>
    suspend fun createFolder(): Folder
    suspend fun editFolder(): Folder
    suspend fun deleteFolder()
}
internal class FolderRepositoryImpl(private val context: Context): FolderRepository {

    val db = NoteDataBase.getDataBaseInstance(context)


    override suspend fun loadFolder(folderName: String): List<Note> =
        db.folderDao().getNotes(folderName)



    override suspend fun createFolder(): Folder {
        TODO("Not yet implemented")
    }

    override suspend fun editFolder(): Folder {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFolder() {
        TODO("Not yet implemented")
    }
}