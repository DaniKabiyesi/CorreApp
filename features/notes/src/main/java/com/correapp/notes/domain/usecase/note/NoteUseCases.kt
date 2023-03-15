package com.correapp.notes.domain.usecase.note

data class NoteUseCases(
    val createNoteUseCase: CreateNoteUseCase,
    val editNoteUseCase: EditNoteUseCase,
    val loadNotesUseCase: LoadNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase
)
