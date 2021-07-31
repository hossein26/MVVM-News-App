package com.hossein.mvvmnewsapp.ui

import androidx.lifecycle.ViewModel
import com.hossein.mvvmnewsapp.repository.NewsRepository

class NewsViewModel(val newsRepository: NewsRepository): ViewModel() {
}