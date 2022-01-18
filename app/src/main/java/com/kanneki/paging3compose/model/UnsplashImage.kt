package com.kanneki.paging3compose.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kanneki.paging3compose.util.Constants.INSPLASH_IMAGE_TABLE

@Entity(tableName = INSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
)