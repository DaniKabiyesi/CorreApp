package com.correapp.notes.domain.usecase.note

import com.correapp.notes.domain.model.Note
import com.correapp.notes.domain.repository.NoteRepository
import javax.inject.Inject

class LoadNotesUseCase @Inject constructor(
    private val repository: NoteRepository,
) {
    suspend fun invoke(): List<Note> =
        repository.loadNotes()
}
