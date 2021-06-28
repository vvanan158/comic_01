package com.example.comic.data.repository.source.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.comic.data.model.Comic
import com.example.comic.data.repository.source.ComicDataSource

class ComicLocalImpl : ComicDataSource.Local {

    override suspend fun getComicsLocal(): LiveData<MutableList<Comic>> {
        return liveData { mutableListOf<Comic>() }
    }
}
