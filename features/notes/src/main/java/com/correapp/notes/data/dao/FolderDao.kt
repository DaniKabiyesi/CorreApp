package com.correapp.notes.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.correapp.notes.domain.model.Folder

@Dao
interface FolderDao {
    @Query("SELECT * FROM folder")
    fun loadFolders(): List<Folder>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addFolder(folderName: String): Folder

    @Update
    fun editFolder(folder: Folder): Folder

    @Delete
    fun deleteFolder()
}
