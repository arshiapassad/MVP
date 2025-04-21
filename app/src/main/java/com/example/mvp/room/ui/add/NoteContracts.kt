package com.example.mvp.room.ui.add

import academy.nouri.s3_mvp.base.BasePresenter
import com.example.mvp.room.data.model.NoteEntity

interface NoteContracts {

    interface View{
        fun close()
        fun loadNote(note : NoteEntity)
    }
    interface Presenter : BasePresenter{
        fun saveNote(entity: NoteEntity)
        fun detailNote(id: Int)
        fun updateNote(entity: NoteEntity)
    }
}