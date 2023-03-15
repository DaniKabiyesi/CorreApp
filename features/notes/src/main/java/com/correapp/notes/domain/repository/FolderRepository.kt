package com.correapp.notes.domain.repository

import com.correapp.notes.data.dao.FolderDao
import com.correapp.notes.domain.model.Folder
import javax.inject.Inject

interface FolderRepository {
    suspend fun loadFolders(): List<Folder>
    suspend fun addFolder(folder: Folder): Folder
    suspend fun editFolder(folder: Folder): Folder
    suspend fun deleteFolder(folder: Folder)
}

class FolderRepositoryImpl @Inject constructor(
    private val folderDao: FolderDao,
) : FolderRepository {

    override suspend fun loadFolders(): List<Folder> =
        folderDao.loadFolders()

    override suspend fun addFolder(folder: Folder): Folder =
        folderDao.addFolder(folder)

    override suspend fun editFolder(folder: Folder): Folder =
        folderDao.editFolder(folder)

    override suspend fun deleteFolder(folder: Folder) =
        folderDao.deleteFolder(folder)
}
