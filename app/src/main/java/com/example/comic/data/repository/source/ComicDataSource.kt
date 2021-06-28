package com.example.comic.data.repository.source

import androidx.lifecycle.LiveData
import com.example.comic.data.model.Comic

interface ComicDataSource {

    interface Local {
        suspend fun getComicsLocal(): LiveData<MutableList<Comic>>
    }

    interface Remote {
        suspend fun getComics(): MutableList<Comic>
    }
}
