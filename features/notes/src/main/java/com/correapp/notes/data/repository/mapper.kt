package com.correapp.notes.data.repository

import com.correapp.notes.data.entity.FolderEntity
import com.correapp.notes.data.entity.NoteEntity
import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.model.Note

fun NoteEntity.toNote() = Note(
    id = this.id,
    title = this.title,
    description = this.description,
    folder = this.folder ?: ""
)

fun FolderEntity.toFolder() = Folder(
    id = this.id,
    name = this.name,
    notes = this.notes ?: listOf()
)

fun Folder.toFolderEntity() = FolderEntity(
    id = this.id,
    name = this.name,
    notes = this.notes ?: listOf()
)

fun Note.toNoteEntity() = NoteEntity(
    id = this.id,
    title = this.title,
    description = this.description,
    folder = this.folder ?: ""
)