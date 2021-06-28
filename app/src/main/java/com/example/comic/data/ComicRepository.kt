package com.example.comic.data

import androidx.lifecycle.LiveData
import com.example.comic.data.model.Comic
import com.example.comic.utils.scheduler.DataResult

interface ComicRepository {
    /**
     * Local
     */
    suspend fun getComicsLocal(): LiveData<MutableList<Comic>>

    /**
     * Remote
     */
    suspend fun getComics(): DataResult<MutableList<Comic>>
}
