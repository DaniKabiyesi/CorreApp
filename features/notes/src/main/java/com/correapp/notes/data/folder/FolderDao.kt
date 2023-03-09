package com.correapp.notes.data.folder

import androidx.room.*
import com.correapp.notes.domain.model.Folder
import com.correapp.notes.domain.model.Note

@Dao
internal interface FolderDao {
    @Query ("SELECT * FROM folder")
    fun loadFolders(): List<Folder>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addFolder(folderName: String): Folder

    @Update
    fun editFolder(folder: Folder): Folder

    @Delete
    fun deleteFolder()
}