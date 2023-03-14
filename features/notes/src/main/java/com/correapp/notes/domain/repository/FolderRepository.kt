package com.correapp.notes.domain.repository

import com.correapp.notes.data.dao.FolderDao
import com.correapp.notes.domain.model.Folder
import javax.inject.Inject

interface FolderRepository {
    suspend fun loadFolders(): List<Folder>
    suspend fun addFolder(folderName: String): Folder
    suspend fun editFolder(folder: Folder): Folder
    suspend fun deleteFolder()
}

class FolderRepositoryImpl @Inject constructor(
    private val folderDao: FolderDao,
) : FolderRepository {

    override suspend fun loadFolders(): List<Folder> =
        folderDao.loadFolders()

    override suspend fun addFolder(folderName: String): Folder =
        folderDao.addFolder(folderName)

    override suspend fun editFolder(folder: Folder): Folder =
        folderDao.editFolder(folder)

    override suspend fun deleteFolder() =
        folderDao.deleteFolder()
}
