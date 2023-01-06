package com.example.jetquiz.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jetquiz.components.Questions

@Composable
fun QuizHome(viewModel: QuestionsViewModel= hiltViewModel()) {
    Questions(viewModel)
}