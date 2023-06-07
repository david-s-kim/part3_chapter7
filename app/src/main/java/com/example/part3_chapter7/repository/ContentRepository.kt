package com.example.part3_chapter7.repository

import com.example.part3_chapter7.model.ContentEntity

interface ContentRepository {

    suspend fun insert(item: ContentEntity)

}