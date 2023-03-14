package com.correapp.notes.domain.usecase

data class NoteUseCases(
    private val createNoteUseCase: CreateNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
    private val loadNotesUseCase: LoadNotesUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase,
)
