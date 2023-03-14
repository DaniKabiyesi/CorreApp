package com.correapp.notes.domain.model.mapper

import com.correapp.notes.domain.model.Folder
import com.correapp.notes.presentation.uimodel.FolderUiModel

fun Folder.convertToUiModel(): FolderUiModel =
    FolderUiModel(
        name = this.name,
        notes = this.notes,
    )
