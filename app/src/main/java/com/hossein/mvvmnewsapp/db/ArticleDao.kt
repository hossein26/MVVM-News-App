package com.hossein.mvvmnewsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.hossein.mvvmnewsapp.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Delete
    suspend fun deleteArticle(article: Article)

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

}