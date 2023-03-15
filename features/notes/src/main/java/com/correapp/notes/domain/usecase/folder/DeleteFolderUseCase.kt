package com.correapp.notes.domain.usecase.folder

import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.repository.FolderRepository
import javax.inject.Inject

class DeleteFolderUseCase @Inject constructor(
    private val repository: FolderRepository,
) {
    suspend operator fun invoke(folder: Folder) =
        repository.deleteFolder(folder)
}