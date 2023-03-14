package com.correapp.notes.domain.usecase

import com.correapp.notes.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val repository: NoteRepository,
) {
    suspend operator fun invoke() =
        repository.deleteNote()
}
