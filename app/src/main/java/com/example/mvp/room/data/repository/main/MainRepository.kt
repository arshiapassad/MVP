package com.example.mvp.room.data.repository.main

import com.example.mvp.room.data.database.NoteDao
import com.example.mvp.room.data.model.NoteEntity
import javax.inject.Inject

class MainRepository @Inject constructor(private val dao: NoteDao){
    fun loadAllNotes() = dao.getAllNotes()
    fun deleteNote(entity: NoteEntity) = dao.deleteNote(entity)
    fun filterNote(priority: String) = dao.filerNote(priority)
    fun searchNote(title: String) = dao.searchNote(title)
}