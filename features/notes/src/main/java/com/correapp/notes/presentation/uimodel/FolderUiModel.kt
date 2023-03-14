package com.correapp.notes.presentation.uimodel

import com.correapp.notes.domain.model.Note

data class FolderUiModel(
    private val name: String,
    private val notes: List<Note>,
)
