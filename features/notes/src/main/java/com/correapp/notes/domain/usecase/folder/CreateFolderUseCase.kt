package com.correapp.notes.domain.usecase.folder

import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.repository.FolderRepository
import com.correapp.notes.domain.usecase.model.FolderUseCaseState
import javax.inject.Inject

class CreateFolderUseCase @Inject constructor(
    private val repository: FolderRepository,
) {
    suspend operator fun invoke(folder: Folder): FolderUseCaseState =
        if (folder.name.length >= CHARACTERS_LIMIT) {
            FolderUseCaseState.CharactersErrorState
            throw Exception(message = "Limite de caracteres invalido")
        } else if (repository.loadFolders().any { folder.name == it.name }) {
            FolderUseCaseState.AlreadyExistsErrorState
            throw Exception(message = "Pasta já existente")
        } else {
            repository.addFolder(folder)
            FolderUseCaseState.SuccessState
        }

    companion object {
        const val CHARACTERS_LIMIT = 20
    }
}
