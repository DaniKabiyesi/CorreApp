package com.correapp.notes.domain.usecase.folder

import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.repository.FolderRepository
import javax.inject.Inject

class LoadFoldersUseCase @Inject constructor(
    private val repository: FolderRepository,
) {
    suspend operator fun invoke(): List<Folder> =
        repository.loadFolders()
}