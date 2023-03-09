package com.correapp.notes.domain.repository

import android.content.Context
import com.correapp.notes.data.NoteDataBase
import com.correapp.notes.domain.model.Folder

internal interface FolderRepository {
    suspend fun loadFolders(): List<Folder>
    suspend fun addFolder(folderName: String): Folder
    suspend fun editFolder(folder: Folder): Folder
    suspend fun deleteFolder()
}

internal class FolderRepositoryImpl(private val context: Context) : FolderRepository {

    private val db = NoteDataBase.getDataBaseInstance(context)

    override suspend fun loadFolders(): List<Folder> =
        db.folderDao().loadFolders()

    override suspend fun addFolder(folderName: String): Folder =
        db.folderDao().addFolder(folderName)

    override suspend fun editFolder(folder: Folder): Folder =
        db.folderDao().editFolder(folder)

    override suspend fun deleteFolder() =
        db.folderDao().deleteFolder()
}