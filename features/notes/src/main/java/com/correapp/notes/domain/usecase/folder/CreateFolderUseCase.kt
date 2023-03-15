package com.correapp.notes.domain.usecase.folder

import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.repository.FolderRepository
import javax.inject.Inject

class CreateFolderUseCase @Inject constructor(
    private val repository: FolderRepository,
) {
    suspend operator fun invoke(folder: Folder): FolderState {
        return if (folder.name.length >= CHARACTERS_LIMIT) {
            FolderState.LimitExceedFailed
        } else if (repository.loadFolders().any { folder.name == it.name }) {
            FolderState.FolderAlreadyExistsFailed
        } else {
            repository.addFolder(folder)
            FolderState.Success
        }
    }

    companion object {
        const val CHARACTERS_LIMIT = 20
    }
}

sealed class FolderState {
    object Success : FolderState()
    object LimitExceedFailed : FolderState()
    object FolderAlreadyExistsFailed : FolderState()
}
