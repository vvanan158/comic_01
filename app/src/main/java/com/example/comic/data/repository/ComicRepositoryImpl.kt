package com.example.comic.data.repository

import androidx.lifecycle.LiveData
import com.example.comic.data.ComicRepository
import com.example.comic.data.model.Comic
import com.example.comic.data.repository.source.ComicDataSource
import com.example.comic.utils.base.BaseRepository

class ComicRepositoryImpl(
    private val remote: ComicDataSource.Remote,
    private val local: ComicDataSource.Local
) : BaseRepository(),
    ComicRepository {

    override suspend fun getComicsLocal(): LiveData<MutableList<Comic>> = local.getComicsLocal()

    override suspend fun getComics() = withResultContext {
        remote.getComics()
    }
}
