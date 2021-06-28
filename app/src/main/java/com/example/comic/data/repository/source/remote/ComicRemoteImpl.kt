package com.example.comic.data.repository.source.remote

import com.example.comic.data.model.Comic
import com.example.comic.data.repository.source.ComicDataSource

class ComicRemoteImpl() : ComicDataSource.Remote {

    override suspend fun getComics() = arrayListOf<Comic>()
}
