package com.correapp.notes.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.correapp.notes.domain.repository.FolderRepository
import com.correapp.notes.domain.repository.NoteRepository
import com.correapp.notes.domain.usecase.note.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    folderRepository: FolderRepository,
    noteRepository: NoteRepository,
    private val useCase: NoteUseCases
) : ViewModel() {

    fun t (){
        useCase.createNoteUseCase
    }


}