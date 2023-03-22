package com.correapp.notes.domain.repository

import com.correapp.notes.domain.model.Folder

interface FolderRepository {
    suspend fun loadFolders(): List<Folder>
    suspend fun addFolder(folder: Folder)
    suspend fun editFolder(folder: Folder): Folder
    suspend fun deleteFolder(folder: Folder)
}
