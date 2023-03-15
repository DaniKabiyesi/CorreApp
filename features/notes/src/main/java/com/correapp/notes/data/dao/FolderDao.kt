package com.correapp.notes.data.dao

import androidx.room.*
import com.correapp.notes.domain.model.Folder

@Dao
interface FolderDao {
    @Query("SELECT * FROM folder")
    fun loadFolders(): List<Folder>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addFolder(folder: Folder): Folder

    @Update
    fun editFolder(folder: Folder): Folder

    @Delete
    fun deleteFolder(folder: Folder)
}
