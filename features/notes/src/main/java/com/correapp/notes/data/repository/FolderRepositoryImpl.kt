package com.correapp.notes.data.repository

import com.correapp.notes.data.dao.FolderDao
import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.repository.FolderRepository
import javax.inject.Inject

class FolderRepositoryImpl @Inject constructor(
    private val folderDao: FolderDao,
) : FolderRepository {
    override suspend fun loadFolders(): List<Folder> = folderDao.loadFolders().map { it.toFolder() }

    override suspend fun addFolder(folder: Folder) = folderDao.addFolder(folder.toFolderEntity())

    override suspend fun editFolder(folder: Folder): Folder =
        folderDao.editFolder(folder).toFolder()

    override suspend fun deleteFolder(folder: Folder) =
        folderDao.deleteFolder(folder.toFolderEntity())
}
