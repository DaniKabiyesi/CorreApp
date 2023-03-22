package com.correapp.notes.domain.usecase.model

sealed class FolderUseCaseState {
    object SuccessState : FolderUseCaseState()
    object CharactersErrorState : FolderUseCaseState()
    object AlreadyExistsErrorState : FolderUseCaseState()
}
