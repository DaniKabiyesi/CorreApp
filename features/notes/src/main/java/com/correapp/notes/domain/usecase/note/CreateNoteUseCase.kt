package com.correapp.notes.domain.usecase.note

import com.correapp.notes.domain.model.Note
import com.correapp.notes.domain.repository.NoteRepository
import javax.inject.Inject

class CreateNoteUseCase @Inject constructor(
    private val repository: NoteRepository,
) {
    suspend operator fun invoke(note: Note) =
        repository.addNote(note)
}
