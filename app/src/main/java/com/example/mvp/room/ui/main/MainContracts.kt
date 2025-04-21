package com.example.mvp.room.ui.main

import academy.nouri.s3_mvp.base.BasePresenter
import com.example.mvp.room.data.model.NoteEntity

interface MainContracts {

    interface View{
        fun showAllNotes(notes : List<NoteEntity>)
        fun showEmpty()
        fun deleteMessage()
    }

    interface Presenter : BasePresenter{
        fun loadAllNotes()
        fun deleteNote(entity: NoteEntity)
        fun filterNote(priority: String)
        fun searchNote(title: String)
    }
}