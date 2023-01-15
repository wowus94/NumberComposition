package com.vlyashuk.numbercomposition.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOgRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
)