package com.correapp.notes.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.model.Note
import com.correapp.notes.domain.usecase.folder.FolderUseCases
import com.correapp.notes.domain.usecase.model.FolderUseCaseState
import com.correapp.notes.domain.usecase.note.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

sealed class FolderState {
    object Success : FolderState()
    object LimitExceedFailed : FolderState()
    object FolderAlreadyExistsFailed : FolderState()
}
@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases,
    private val folderUseCases: FolderUseCases,
    private val folder: Folder
) : ViewModel() {

    private val _noteViewModel = MutableLiveData<Note>()
    val noteViewModel: LiveData<Note> get() = _noteViewModel
    suspend fun getFolders() {
        when (folderUseCases.createFolderUseCase.invoke(folder)) {
            FolderUseCaseState.SuccessState -> {
                TODO()
            }
            FolderUseCaseState.CharactersErrorState -> {
                TODO()
            }
            FolderUseCaseState.AlreadyExistsErrorState -> {
                TODO()
            }
        }
    }
}
