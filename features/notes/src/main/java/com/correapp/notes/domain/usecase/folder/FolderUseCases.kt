package com.correapp.notes.domain.usecase.folder

data class FolderUseCases(
    val createFolderUseCase: CreateFolderUseCase,
    val editFolderUseCase: EditFolderUseCase,
    val loadFolderUseCase: LoadFoldersUseCase,
    val deleteFolderUseCase: DeleteFolderUseCase
)